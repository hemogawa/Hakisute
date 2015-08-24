package hakisute.entity;

import hakisute.entity.EntryNames._EntryNames;
import hakisute.entity.EntryTagRelationNames._EntryTagRelationNames;
import hakisute.entity.TagNames._TagNames;
import hakisute.entity.UserNames._UserNames;
import javax.annotation.Generated;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2015/08/14 1:58:49")
public class Names {

    /**
     * {@link Entry}の名前クラスを返します。
     * 
     * @return Entryの名前クラス
     */
    public static _EntryNames entry() {
        return new _EntryNames();
    }

    /**
     * {@link EntryTagRelation}の名前クラスを返します。
     * 
     * @return EntryTagRelationの名前クラス
     */
    public static _EntryTagRelationNames entryTagRelation() {
        return new _EntryTagRelationNames();
    }

    /**
     * {@link Tag}の名前クラスを返します。
     * 
     * @return Tagの名前クラス
     */
    public static _TagNames tag() {
        return new _TagNames();
    }

    /**
     * {@link User}の名前クラスを返します。
     * 
     * @return Userの名前クラス
     */
    public static _UserNames user() {
        return new _UserNames();
    }
}