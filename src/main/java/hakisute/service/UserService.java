package hakisute.service;

import hakisute.entity.User;
import java.util.List;
import javax.annotation.Generated;

import static hakisute.entity.UserNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link User}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2015/08/14 1:58:54")
public class UserService extends AbstractService<User> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param userId
     *            識別子
     * @return エンティティ
     */
    public User findById(Integer userId) {
        return select().id(userId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<User> findAllOrderById() {
        return select().orderBy(asc(userId())).getResultList();
    }
}