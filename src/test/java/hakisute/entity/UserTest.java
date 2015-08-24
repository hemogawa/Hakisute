package hakisute.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static hakisute.entity.UserNames.*;

/**
 * {@link User}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2015/08/14 1:58:57")
public class UserTest extends S2TestCase {

    private JdbcManager jdbcManager;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("s2jdbc.dicon");
    }

    /**
     * 識別子による取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindById() throws Exception {
        jdbcManager.from(User.class).id(1).getSingleResult();
    }

    /**
     * entryListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_entryList() throws Exception {
        jdbcManager.from(User.class).leftOuterJoin(entryList()).id(1).getSingleResult();
    }
}