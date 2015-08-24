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
 * Tagエンティティクラス
 *
 */
@Entity
@Table(name="tag")
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2015/08/14 1:58:42")
public class Tag implements Serializable {

    private static final long serialVersionUID = 1L;

    /** tagIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Integer tagId;

    /** tagNameプロパティ */
    @Column(length = 1, nullable = true, unique = false)
    public String tagName;

    /** insertDateプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp insertDate;

    /** updateDateプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp updateDate;

    /** deleteFlgプロパティ */
    @Column(nullable = false, unique = false)
    public Boolean deleteFlg;

    /** entryTagRelationList関連プロパティ */
    @OneToMany(mappedBy = "tag")
    public List<EntryTagRelation> entryTagRelationList;
}