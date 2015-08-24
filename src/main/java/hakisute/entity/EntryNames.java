package hakisute.entity;

import hakisute.entity.EntryTagRelationNames._EntryTagRelationNames;
import hakisute.entity.UserNames._UserNames;
import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Entry}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/08/14 1:58:49")
public class EntryNames {

    /**
     * entryIdのプロパティ名を返します。
     * 
     * @return entryIdのプロパティ名
     */
    public static PropertyName<Integer> entryId() {
        return new PropertyName<Integer>("entryId");
    }

    /**
     * entryBodyのプロパティ名を返します。
     * 
     * @return entryBodyのプロパティ名
     */
    public static PropertyName<String> entryBody() {
        return new PropertyName<String>("entryBody");
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
     * userIdのプロパティ名を返します。
     * 
     * @return userIdのプロパティ名
     */
    public static PropertyName<Integer> userId() {
        return new PropertyName<Integer>("userId");
    }

    /**
     * userのプロパティ名を返します。
     * 
     * @return userのプロパティ名
     */
    public static _UserNames user() {
        return new _UserNames("user");
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
    public static class _EntryNames extends PropertyName<Entry> {

        /**
         * インスタンスを構築します。
         */
        public _EntryNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _EntryNames(final String name) {
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
        public _EntryNames(final PropertyName<?> parent, final String name) {
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
         * entryBodyのプロパティ名を返します。
         *
         * @return entryBodyのプロパティ名
         */
        public PropertyName<String> entryBody() {
            return new PropertyName<String>(this, "entryBody");
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
         * userIdのプロパティ名を返します。
         *
         * @return userIdのプロパティ名
         */
        public PropertyName<Integer> userId() {
            return new PropertyName<Integer>(this, "userId");
        }

        /**
         * userのプロパティ名を返します。
         * 
         * @return userのプロパティ名
         */
        public _UserNames user() {
            return new _UserNames(this, "user");
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