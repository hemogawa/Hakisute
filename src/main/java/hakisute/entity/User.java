package hakisute.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Userエンティティクラス
 *
 */
@Entity
@Table(name="user")
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2015/08/14 1:58:43")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /** userIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Integer userId;

    /** userNameプロパティ */
    @Column(length = 1, nullable = true, unique = false)
    public String userName;

    /** passwordプロパティ */
    @Column(length = 1, nullable = true, unique = false)
    public String password;

    /** insertDateプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp insertDate;

    /** updateDateプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp updateDate;

    /** deleteFlgプロパティ */
    @Column(nullable = false, unique = false)
    public Boolean deleteFlg;

    /** entryList関連プロパティ */
    @OneToMany(mappedBy = "user")
    public List<Entry> entryList;
}