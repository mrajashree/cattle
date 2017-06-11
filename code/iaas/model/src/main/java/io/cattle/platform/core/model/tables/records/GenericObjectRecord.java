/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.GenericObject;
import io.cattle.platform.core.model.tables.GenericObjectTable;
import io.cattle.platform.db.jooq.utils.TableRecordJaxb;

import java.util.Date;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "generic_object", schema = "cattle")
public class GenericObjectRecord extends UpdatableRecordImpl<GenericObjectRecord> implements TableRecordJaxb, Record12<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, String>, GenericObject {

    private static final long serialVersionUID = -820032042;

    /**
     * Setter for <code>cattle.generic_object.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.generic_object.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.generic_object.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.generic_object.name</code>.
     */
    @Column(name = "name", length = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cattle.generic_object.account_id</code>.
     */
    @Override
    public void setAccountId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.generic_object.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    @Override
    public Long getAccountId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>cattle.generic_object.kind</code>.
     */
    @Override
    public void setKind(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cattle.generic_object.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    @Override
    public String getKind() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cattle.generic_object.uuid</code>.
     */
    @Override
    public void setUuid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cattle.generic_object.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    @Override
    public String getUuid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cattle.generic_object.description</code>.
     */
    @Override
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cattle.generic_object.description</code>.
     */
    @Column(name = "description", length = 1024)
    @Override
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cattle.generic_object.state</code>.
     */
    @Override
    public void setState(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>cattle.generic_object.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    @Override
    public String getState() {
        return (String) get(6);
    }

    /**
     * Setter for <code>cattle.generic_object.created</code>.
     */
    @Override
    public void setCreated(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>cattle.generic_object.created</code>.
     */
    @Column(name = "created")
    @Override
    public Date getCreated() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>cattle.generic_object.removed</code>.
     */
    @Override
    public void setRemoved(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>cattle.generic_object.removed</code>.
     */
    @Column(name = "removed")
    @Override
    public Date getRemoved() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>cattle.generic_object.remove_time</code>.
     */
    @Override
    public void setRemoveTime(Date value) {
        set(9, value);
    }

    /**
     * Getter for <code>cattle.generic_object.remove_time</code>.
     */
    @Column(name = "remove_time")
    @Override
    public Date getRemoveTime() {
        return (Date) get(9);
    }

    /**
     * Setter for <code>cattle.generic_object.data</code>.
     */
    @Override
    public void setData(Map<String,Object> value) {
        set(10, value);
    }

    /**
     * Getter for <code>cattle.generic_object.data</code>.
     */
    @Column(name = "data", length = 16777215)
    @Override
    public Map<String,Object> getData() {
        return (Map<String,Object>) get(10);
    }

    /**
     * Setter for <code>cattle.generic_object.key</code>.
     */
    @Override
    public void setKey(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>cattle.generic_object.key</code>.
     */
    @Column(name = "key", length = 255)
    @Override
    public String getKey() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return GenericObjectTable.GENERIC_OBJECT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GenericObjectTable.GENERIC_OBJECT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return GenericObjectTable.GENERIC_OBJECT.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return GenericObjectTable.GENERIC_OBJECT.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return GenericObjectTable.GENERIC_OBJECT.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return GenericObjectTable.GENERIC_OBJECT.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return GenericObjectTable.GENERIC_OBJECT.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return GenericObjectTable.GENERIC_OBJECT.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return GenericObjectTable.GENERIC_OBJECT.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field10() {
        return GenericObjectTable.GENERIC_OBJECT.REMOVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map<String,Object>> field11() {
        return GenericObjectTable.GENERIC_OBJECT.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return GenericObjectTable.GENERIC_OBJECT.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value8() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value9() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value10() {
        return getRemoveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String,Object> value11() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenericObjectRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenericObjectRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenericObjectRecord value3(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenericObjectRecord value4(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenericObjectRecord value5(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenericObjectRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenericObjectRecord value7(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenericObjectRecord value8(Date value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenericObjectRecord value9(Date value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenericObjectRecord value10(Date value) {
        setRemoveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenericObjectRecord value11(Map<String,Object> value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenericObjectRecord value12(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenericObjectRecord values(Long value1, String value2, Long value3, String value4, String value5, String value6, String value7, Date value8, Date value9, Date value10, Map<String,Object> value11, String value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(GenericObject from) {
        setId(from.getId());
        setName(from.getName());
        setAccountId(from.getAccountId());
        setKind(from.getKind());
        setUuid(from.getUuid());
        setDescription(from.getDescription());
        setState(from.getState());
        setCreated(from.getCreated());
        setRemoved(from.getRemoved());
        setRemoveTime(from.getRemoveTime());
        setData(from.getData());
        setKey(from.getKey());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends GenericObject> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GenericObjectRecord
     */
    public GenericObjectRecord() {
        super(GenericObjectTable.GENERIC_OBJECT);
    }

    /**
     * Create a detached, initialised GenericObjectRecord
     */
    public GenericObjectRecord(Long id, String name, Long accountId, String kind, String uuid, String description, String state, Date created, Date removed, Date removeTime, Map<String,Object> data, String key) {
        super(GenericObjectTable.GENERIC_OBJECT);

        set(0, id);
        set(1, name);
        set(2, accountId);
        set(3, kind);
        set(4, uuid);
        set(5, description);
        set(6, state);
        set(7, created);
        set(8, removed);
        set(9, removeTime);
        set(10, data);
        set(11, key);
    }
}
