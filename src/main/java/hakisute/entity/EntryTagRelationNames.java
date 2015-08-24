package hakisute.entity;

import hakisute.entity.EntryNames._EntryNames;
import hakisute.entity.TagNames._TagNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link EntryTagRelation}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/08/14 1:58:49")
public class EntryTagRelationNames {

    /**
     * entryIdのプロパティ名を返します。
     * 
     * @return entryIdのプロパティ名
     */
    public static PropertyName<Integer> entryId() {
        return new PropertyName<Integer>("entryId");
    }

    /**
     * tagIdのプロパティ名を返します。
     * 
     * @return tagIdのプロパティ名
     */
    public static PropertyName<Integer> tagId() {
        return new PropertyName<Integer>("tagId");
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
     * entryのプロパティ名を返します。
     * 
     * @return entryのプロパティ名
     */
    public static _EntryNames entry() {
        return new _EntryNames("entry");
    }

    /**
     * tagのプロパティ名を返します。
     * 
     * @return tagのプロパティ名
     */
    public static _TagNames tag() {
        return new _TagNames("tag");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _EntryTagRelationNames extends PropertyName<EntryTagRelation> {

        /**
         * インスタンスを構築します。
         */
        public _EntryTagRelationNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _EntryTagRelationNames(final String name) {
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
        public _EntryTagRelationNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * entryIdのプロパティ名を返します。
         *
         * @return entryIdのプロパティ名
         */
        public PropertyName<Integer> entryId() {
            return new PropertyName<Integer>(this, "entryId");
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
         * deleteFlgのプロパティ名を返します。
         *
         * @return deleteFlgのプロパティ名
         */
        public PropertyName<Boolean> deleteFlg() {
            return new PropertyName<Boolean>(this, "deleteFlg");
        }

        /**
         * entryのプロパティ名を返します。
         * 
         * @return entryのプロパティ名
         */
        public _EntryNames entry() {
            return new _EntryNames(this, "entry");
        }

        /**
         * tagのプロパティ名を返します。
         * 
         * @return tagのプロパティ名
         */
        public _TagNames tag() {
            return new _TagNames(this, "tag");
        }
    }
}