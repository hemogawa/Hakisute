package hakisute.entity;

import hakisute.entity.EntryTagRelationNames._EntryTagRelationNames;
import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Tag}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/08/14 1:58:49")
public class TagNames {

    /**
     * tagIdのプロパティ名を返します。
     * 
     * @return tagIdのプロパティ名
     */
    public static PropertyName<Integer> tagId() {
        return new PropertyName<Integer>("tagId");
    }

    /**
     * tagNameのプロパティ名を返します。
     * 
     * @return tagNameのプロパティ名
     */
    public static PropertyName<String> tagName() {
        return new PropertyName<String>("tagName");
    }

    /**
     * insertDateのプロパティ名を返します。
     * 
     * @return insertDateのプロパティ名
     */
    public static PropertyName<Timestamp> insertDate() {
        return new PropertyName<Timestamp>("insertDate");
    }

    /**
     * updateDateのプロパティ名を返します。
     * 
     * @return updateDateのプロパティ名
     */
    public static PropertyName<Timestamp> updateDate() {
        return new PropertyName<Timestamp>("updateDate");
    }

    /**
     * deleteFlgのプロパティ名を返します。
     * 
     * @return deleteFlgのプロパティ名
     */
    public static PropertyName<Boolean> deleteFlg() {
        return new PropertyName<Boolean>("deleteFlg");
    }

    /**
     * entryTagRelationListのプロパティ名を返します。
     * 
     * @return entryTagRelationListのプロパティ名
     */
    public static _EntryTagRelationNames entryTagRelationList() {
        return new _EntryTagRelationNames("entryTagRelationList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _TagNames extends PropertyName<Tag> {

        /**
         * インスタンスを構築します。
         */
        public _TagNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _TagNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _TagNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * tagIdのプロパティ名を返します。
         *
         * @return tagIdのプロパティ名
         */
        public PropertyName<Integer> tagId() {
            return new PropertyName<Integer>(this, "tagId");
        }

        /**
         * tagNameのプロパティ名を返します。
         *
         * @return tagNameのプロパティ名
         */
        public PropertyName<String> tagName() {
            return new PropertyName<String>(this, "tagName");
        }

        /**
         * insertDateのプロパティ名を返します。
         *
         * @return insertDateのプロパティ名
         */
        public PropertyName<Timestamp> insertDate() {
            return new PropertyName<Timestamp>(this, "insertDate");
        }

        /**
         * updateDateのプロパティ名を返します。
         *
         * @return updateDateのプロパティ名
         */
        public PropertyName<Timestamp> updateDate() {
            return new PropertyName<Timestamp>(this, "updateDate");
        }

        /**
         * deleteFlgのプロパティ名を返します。
         *
         * @return deleteFlgのプロパティ名
         */
        public PropertyName<Boolean> deleteFlg() {
            return new PropertyName<Boolean>(this, "deleteFlg");
        }

        /**
         * entryTagRelationListのプロパティ名を返します。
         * 
         * @return entryTagRelationListのプロパティ名
         */
        public _EntryTagRelationNames entryTagRelationList() {
            return new _EntryTagRelationNames(this, "entryTagRelationList");
        }
    }
}