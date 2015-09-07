package hakisute.service;

import hakisute.entity.Entry;

import javax.annotation.Generated;

import org.seasar.extension.dataset.DataSet;
import org.seasar.extension.dataset.impl.SqlReader;
import org.seasar.extension.unit.S2TestCase;

/**
 * {@link EntryService}のテストクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceTestModelFactoryImpl"}, date = "2015/08/14 1:59:00")
public class EntryServiceTest extends S2TestCase {

    private EntryService entryService;

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

    /**
     * {@link #entryService}が利用可能であることをテストします。
     *
     * @throws Exception
     */
    public void testAvailable() throws Exception {
        assertNotNull(entryService);
    }

    public void testInsertTx() throws Exception{
    	// 初期データをDBに投入
    	readXlsAllReplaceDb("EntryServiceTest_testInsert_data.xls");

    	// サービスのメソッドを実行
    	Entry entry = new Entry();
    	entry.entryId = 1;
    	entry.entryBody = "testInsert";
    	entry.userId = 1;
    	entry.insertDate = "0000-01-01 00:00:00";
    	entry.updateDate = "0000-01-01 00:00:00";
    	entry.deleteFlg = false;
    	entryService.insert(entry);

    	// DBの正しく更新されていることを確認
    	SqlReader reader = new SqlReader(getDataSource());
    	reader.addTable("entry");
    	DataSet result = reader.read();
    	DataSet expect = readXls("EntryServiceTest_testInsert_expect.xls");

    	assertEquals(expect, result);

    }
}