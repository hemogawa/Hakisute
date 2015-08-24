package hakisute.entity;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * EntryTagRelationエンティティクラス
 *
 */
@Entity
@Table(name="entry_tag_relaation")
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2015/08/14 1:58:42")
public class EntryTagRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    /** entryIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer entryId;

    /** tagIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer tagId;

    /** deleteFlgプロパティ */
    @Column(nullable = false, unique = false)
    public Boolean deleteFlg;

    /** entry関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "entry_id", referencedColumnName = "entry_id")
    public Entry entry;

    /** tag関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "tag_id", referencedColumnName = "tag_id")
    public Tag tag;
}