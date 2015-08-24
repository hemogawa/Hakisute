package hakisute.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static hakisute.entity.EntryNames.*;

/**
 * {@link Entry}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2015/08/14 1:58:57")
public class EntryTest extends S2TestCase {

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
        jdbcManager.from(Entry.class).id(1).getSingleResult();
    }

    /**
     * userとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_user() throws Exception {
        jdbcManager.from(Entry.class).leftOuterJoin(user()).id(1).getSingleResult();
    }

    /**
     * entryTagRelationListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_entryTagRelationList() throws Exception {
        jdbcManager.from(Entry.class).leftOuterJoin(entryTagRelationList()).id(1).getSingleResult();
    }
}