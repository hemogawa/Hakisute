package hakisute.entity;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entryエンティティクラス
 *
 */
@Entity
@Table(name="entry")
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2015/08/14 1:58:42")
public class Entry implements Serializable {

    private static final long serialVersionUID = 1L;

    /** entryIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Integer entryId;

    /** entryBodyプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String entryBody;

    /** insertDateプロパティ */
    @Column(nullable = false, unique = false, columnDefinition="0000-01-01 00:00:00")
    public String insertDate;

    /** updateDateプロパティ */
    @Column(nullable = false, unique = false, columnDefinition="0000-01-01 00:00:00")
    public String updateDate;

    /** deleteFlgプロパティ */
    @Column(nullable = false, unique = false)
    public Boolean deleteFlg;

    /** userIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer userId;

    /** user関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    public User user;

    /** entryTagRelationList関連プロパティ */
    @OneToMany(mappedBy = "entry")
    public List<EntryTagRelation> entryTagRelationList;
}