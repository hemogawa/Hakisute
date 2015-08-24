package hakisute.service;

import hakisute.entity.Entry;
import java.util.List;
import javax.annotation.Generated;

import static hakisute.entity.EntryNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Entry}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2015/08/14 1:58:54")
public class EntryService extends AbstractService<Entry> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param entryId
     *            識別子
     * @return エンティティ
     */
    public Entry findById(Integer entryId) {
        return select().id(entryId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Entry> findAllOrderById() {
        return select().orderBy(asc(entryId())).getResultList();
    }
}