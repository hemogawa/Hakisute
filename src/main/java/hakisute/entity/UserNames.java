package hakisute.entity;

import hakisute.entity.EntryNames._EntryNames;
import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link User}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/08/14 1:58:49")
public class UserNames {

    /**
     * userIdのプロパティ名を返します。
     * 
     * @return userIdのプロパティ名
     */
    public static PropertyName<Integer> userId() {
        return new PropertyName<Integer>("userId");
    }

    /**
     * userNameのプロパティ名を返します。
     * 
     * @return userNameのプロパティ名
     */
    public static PropertyName<String> userName() {
        return new PropertyName<String>("userName");
    }

    /**
     * passwordのプロパティ名を返します。
     * 
     * @return passwordのプロパティ名
     */
    public static PropertyName<String> password() {
        return new PropertyName<String>("password");
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
     * entryListのプロパティ名を返します。
     * 
     * @return entryListのプロパティ名
     */
    public static _EntryNames entryList() {
        return new _EntryNames("entryList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _UserNames extends PropertyName<User> {

        /**
         * インスタンスを構築します。
         */
        public _UserNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _UserNames(final String name) {
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
        public _UserNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * userNameのプロパティ名を返します。
         *
         * @return userNameのプロパティ名
         */
        public PropertyName<String> userName() {
            return new PropertyName<String>(this, "userName");
        }

        /**
         * passwordのプロパティ名を返します。
         *
         * @return passwordのプロパティ名
         */
        public PropertyName<String> password() {
            return new PropertyName<String>(this, "password");
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
         * entryListのプロパティ名を返します。
         * 
         * @return entryListのプロパティ名
         */
        public _EntryNames entryList() {
            return new _EntryNames(this, "entryList");
        }
    }
}