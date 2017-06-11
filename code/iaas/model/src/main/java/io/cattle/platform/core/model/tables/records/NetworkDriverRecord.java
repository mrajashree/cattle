/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.NetworkDriver;
import io.cattle.platform.core.model.tables.NetworkDriverTable;
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
@Table(name = "network_driver", schema = "cattle")
public class NetworkDriverRecord extends UpdatableRecordImpl<NetworkDriverRecord> implements TableRecordJaxb, Record12<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, Long>, NetworkDriver {

    private static final long serialVersionUID = -1588869171;

    /**
     * Setter for <code>cattle.network_driver.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.network_driver.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.network_driver.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.network_driver.name</code>.
     */
    @Column(name = "name", length = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cattle.network_driver.account_id</code>.
     */
    @Override
    public void setAccountId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.network_driver.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    @Override
    public Long getAccountId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>cattle.network_driver.kind</code>.
     */
    @Override
    public void setKind(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cattle.network_driver.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    @Override
    public String getKind() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cattle.network_driver.uuid</code>.
     */
    @Override
    public void setUuid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cattle.network_driver.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    @Override
    public String getUuid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cattle.network_driver.description</code>.
     */
    @Override
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cattle.network_driver.description</code>.
     */
    @Column(name = "description", length = 1024)
    @Override
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cattle.network_driver.state</code>.
     */
    @Override
    public void setState(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>cattle.network_driver.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    @Override
    public String getState() {
        return (String) get(6);
    }

    /**
     * Setter for <code>cattle.network_driver.created</code>.
     */
    @Override
    public void setCreated(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>cattle.network_driver.created</code>.
     */
    @Column(name = "created")
    @Override
    public Date getCreated() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>cattle.network_driver.removed</code>.
     */
    @Override
    public void setRemoved(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>cattle.network_driver.removed</code>.
     */
    @Column(name = "removed")
    @Override
    public Date getRemoved() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>cattle.network_driver.remove_time</code>.
     */
    @Override
    public void setRemoveTime(Date value) {
        set(9, value);
    }

    /**
     * Getter for <code>cattle.network_driver.remove_time</code>.
     */
    @Column(name = "remove_time")
    @Override
    public Date getRemoveTime() {
        return (Date) get(9);
    }

    /**
     * Setter for <code>cattle.network_driver.data</code>.
     */
    @Override
    public void setData(Map<String,Object> value) {
        set(10, value);
    }

    /**
     * Getter for <code>cattle.network_driver.data</code>.
     */
    @Column(name = "data", length = 16777215)
    @Override
    public Map<String,Object> getData() {
        return (Map<String,Object>) get(10);
    }

    /**
     * Setter for <code>cattle.network_driver.service_id</code>.
     */
    @Override
    public void setServiceId(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>cattle.network_driver.service_id</code>.
     */
    @Column(name = "service_id", precision = 19)
    @Override
    public Long getServiceId() {
        return (Long) get(11);
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
    public Row12<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return NetworkDriverTable.NETWORK_DRIVER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return NetworkDriverTable.NETWORK_DRIVER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return NetworkDriverTable.NETWORK_DRIVER.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return NetworkDriverTable.NETWORK_DRIVER.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return NetworkDriverTable.NETWORK_DRIVER.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return NetworkDriverTable.NETWORK_DRIVER.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return NetworkDriverTable.NETWORK_DRIVER.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return NetworkDriverTable.NETWORK_DRIVER.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return NetworkDriverTable.NETWORK_DRIVER.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field10() {
        return NetworkDriverTable.NETWORK_DRIVER.REMOVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map<String,Object>> field11() {
        return NetworkDriverTable.NETWORK_DRIVER.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return NetworkDriverTable.NETWORK_DRIVER.SERVICE_ID;
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
    public Long value12() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkDriverRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkDriverRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkDriverRecord value3(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkDriverRecord value4(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkDriverRecord value5(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkDriverRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkDriverRecord value7(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkDriverRecord value8(Date value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkDriverRecord value9(Date value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkDriverRecord value10(Date value) {
        setRemoveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkDriverRecord value11(Map<String,Object> value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkDriverRecord value12(Long value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkDriverRecord values(Long value1, String value2, Long value3, String value4, String value5, String value6, String value7, Date value8, Date value9, Date value10, Map<String,Object> value11, Long value12) {
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
    public void from(NetworkDriver from) {
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
        setServiceId(from.getServiceId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends NetworkDriver> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NetworkDriverRecord
     */
    public NetworkDriverRecord() {
        super(NetworkDriverTable.NETWORK_DRIVER);
    }

    /**
     * Create a detached, initialised NetworkDriverRecord
     */
    public NetworkDriverRecord(Long id, String name, Long accountId, String kind, String uuid, String description, String state, Date created, Date removed, Date removeTime, Map<String,Object> data, Long serviceId) {
        super(NetworkDriverTable.NETWORK_DRIVER);

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
        set(11, serviceId);
    }
}
