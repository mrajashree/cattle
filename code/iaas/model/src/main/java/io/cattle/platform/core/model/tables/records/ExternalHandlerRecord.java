/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.ExternalHandler;
import io.cattle.platform.core.model.tables.ExternalHandlerTable;
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
import org.jooq.Record11;
import org.jooq.Row11;
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
@Table(name = "external_handler", schema = "cattle")
public class ExternalHandlerRecord extends UpdatableRecordImpl<ExternalHandlerRecord> implements TableRecordJaxb, Record11<Long, String, String, String, String, String, Date, Date, Date, Map<String,Object>, Integer>, ExternalHandler {

    private static final long serialVersionUID = -340987446;

    /**
     * Setter for <code>cattle.external_handler.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.external_handler.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.external_handler.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.external_handler.name</code>.
     */
    @Column(name = "name", length = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cattle.external_handler.kind</code>.
     */
    @Override
    public void setKind(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.external_handler.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    @Override
    public String getKind() {
        return (String) get(2);
    }

    /**
     * Setter for <code>cattle.external_handler.uuid</code>.
     */
    @Override
    public void setUuid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cattle.external_handler.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    @Override
    public String getUuid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cattle.external_handler.description</code>.
     */
    @Override
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cattle.external_handler.description</code>.
     */
    @Column(name = "description", length = 1024)
    @Override
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cattle.external_handler.state</code>.
     */
    @Override
    public void setState(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cattle.external_handler.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    @Override
    public String getState() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cattle.external_handler.created</code>.
     */
    @Override
    public void setCreated(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>cattle.external_handler.created</code>.
     */
    @Column(name = "created")
    @Override
    public Date getCreated() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>cattle.external_handler.removed</code>.
     */
    @Override
    public void setRemoved(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>cattle.external_handler.removed</code>.
     */
    @Column(name = "removed")
    @Override
    public Date getRemoved() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>cattle.external_handler.remove_time</code>.
     */
    @Override
    public void setRemoveTime(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>cattle.external_handler.remove_time</code>.
     */
    @Column(name = "remove_time")
    @Override
    public Date getRemoveTime() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>cattle.external_handler.data</code>.
     */
    @Override
    public void setData(Map<String,Object> value) {
        set(9, value);
    }

    /**
     * Getter for <code>cattle.external_handler.data</code>.
     */
    @Column(name = "data", length = 16777215)
    @Override
    public Map<String,Object> getData() {
        return (Map<String,Object>) get(9);
    }

    /**
     * Setter for <code>cattle.external_handler.priority</code>.
     */
    @Override
    public void setPriority(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>cattle.external_handler.priority</code>.
     */
    @Column(name = "priority", precision = 10)
    @Override
    public Integer getPriority() {
        return (Integer) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, String, String, String, String, Date, Date, Date, Map<String,Object>, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, String, String, String, String, Date, Date, Date, Map<String,Object>, Integer> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ExternalHandlerTable.EXTERNAL_HANDLER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ExternalHandlerTable.EXTERNAL_HANDLER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ExternalHandlerTable.EXTERNAL_HANDLER.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ExternalHandlerTable.EXTERNAL_HANDLER.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ExternalHandlerTable.EXTERNAL_HANDLER.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ExternalHandlerTable.EXTERNAL_HANDLER.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return ExternalHandlerTable.EXTERNAL_HANDLER.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return ExternalHandlerTable.EXTERNAL_HANDLER.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return ExternalHandlerTable.EXTERNAL_HANDLER.REMOVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map<String,Object>> field10() {
        return ExternalHandlerTable.EXTERNAL_HANDLER.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return ExternalHandlerTable.EXTERNAL_HANDLER.PRIORITY;
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
    public String value3() {
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value8() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value9() {
        return getRemoveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String,Object> value10() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalHandlerRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalHandlerRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalHandlerRecord value3(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalHandlerRecord value4(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalHandlerRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalHandlerRecord value6(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalHandlerRecord value7(Date value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalHandlerRecord value8(Date value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalHandlerRecord value9(Date value) {
        setRemoveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalHandlerRecord value10(Map<String,Object> value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalHandlerRecord value11(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalHandlerRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, Date value7, Date value8, Date value9, Map<String,Object> value10, Integer value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ExternalHandler from) {
        setId(from.getId());
        setName(from.getName());
        setKind(from.getKind());
        setUuid(from.getUuid());
        setDescription(from.getDescription());
        setState(from.getState());
        setCreated(from.getCreated());
        setRemoved(from.getRemoved());
        setRemoveTime(from.getRemoveTime());
        setData(from.getData());
        setPriority(from.getPriority());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ExternalHandler> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExternalHandlerRecord
     */
    public ExternalHandlerRecord() {
        super(ExternalHandlerTable.EXTERNAL_HANDLER);
    }

    /**
     * Create a detached, initialised ExternalHandlerRecord
     */
    public ExternalHandlerRecord(Long id, String name, String kind, String uuid, String description, String state, Date created, Date removed, Date removeTime, Map<String,Object> data, Integer priority) {
        super(ExternalHandlerTable.EXTERNAL_HANDLER);

        set(0, id);
        set(1, name);
        set(2, kind);
        set(3, uuid);
        set(4, description);
        set(5, state);
        set(6, created);
        set(7, removed);
        set(8, removeTime);
        set(9, data);
        set(10, priority);
    }
}
