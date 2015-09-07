package hakisute.action;

import hakisute.form.EntryForm;
import hakisute.service.EntryService;

import org.seasar.extension.unit.S2TestCase;
import org.seasar.framework.aop.interceptors.MockInterceptor;

public class EntryActionTest extends S2TestCase {
    /**
     * 事前処理をします。
     *
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("app.dicon");
    }

	public void testGoCompleteTx() throws Exception {
		// 初期データをDBに投入
		readXlsAllReplaceDb("EntryActionTest_testGoComplete_data.xls");

		// アクションのインスタンスを作成
		EntryAction entryAction = new EntryAction();

		// モックを作成
		MockInterceptor mock = new MockInterceptor();

		// サービスの戻り値を設定
		mock.setReturnValue("insert", 1);

		// モックオブジェクトを作成してアクションにセット
		entryAction.entryService = (EntryService) mock.createProxy(EntryService.class);

		// アクションフォームに値を設定
		EntryForm entryForm = new EntryForm();
		entryForm.entry_body = "EntryActionTest";
		entryAction.entryForm = entryForm;

		// 実行メソッドを実行
		String result = entryAction.goComplete();
		assertEquals("complete.jsp",result);
	}
}
