package hakisute.service;

import hakisute.entity.Tag;
import java.util.List;
import javax.annotation.Generated;

import static hakisute.entity.TagNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Tag}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2015/08/14 1:58:54")
public class TagService extends AbstractService<Tag> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param tagId
     *            識別子
     * @return エンティティ
     */
    public Tag findById(Integer tagId) {
        return select().id(tagId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Tag> findAllOrderById() {
        return select().orderBy(asc(tagId())).getResultList();
    }
}