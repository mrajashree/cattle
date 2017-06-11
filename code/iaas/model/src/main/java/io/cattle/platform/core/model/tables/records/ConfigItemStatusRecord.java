/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.ConfigItemStatus;
import io.cattle.platform.core.model.tables.ConfigItemStatusTable;
import io.cattle.platform.db.jooq.utils.TableRecordJaxb;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
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
@Table(name = "config_item_status", schema = "cattle", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"name", "resource_type", "resource_id"})
})
public class ConfigItemStatusRecord extends UpdatableRecordImpl<ConfigItemStatusRecord> implements TableRecordJaxb, Record15<Long, String, Long, Long, String, Date, Date, Long, Long, Long, Long, String, Long, Long, Long>, ConfigItemStatus {

    private static final long serialVersionUID = 897097947;

    /**
     * Setter for <code>cattle.config_item_status.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.config_item_status.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 20)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.config_item_status.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.config_item_status.name</code>.
     */
    @Column(name = "name", nullable = false, length = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cattle.config_item_status.requested_version</code>.
     */
    @Override
    public void setRequestedVersion(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.config_item_status.requested_version</code>.
     */
    @Column(name = "requested_version", nullable = false, precision = 19)
    @Override
    public Long getRequestedVersion() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>cattle.config_item_status.applied_version</code>.
     */
    @Override
    public void setAppliedVersion(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>cattle.config_item_status.applied_version</code>.
     */
    @Column(name = "applied_version", nullable = false, precision = 19)
    @Override
    public Long getAppliedVersion() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>cattle.config_item_status.source_version</code>.
     */
    @Override
    public void setSourceVersion(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cattle.config_item_status.source_version</code>.
     */
    @Column(name = "source_version", length = 255)
    @Override
    public String getSourceVersion() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cattle.config_item_status.requested_updated</code>.
     */
    @Override
    public void setRequestedUpdated(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>cattle.config_item_status.requested_updated</code>.
     */
    @Column(name = "requested_updated", nullable = false)
    @Override
    public Date getRequestedUpdated() {
        return (Date) get(5);
    }

    /**
     * Setter for <code>cattle.config_item_status.applied_updated</code>.
     */
    @Override
    public void setAppliedUpdated(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>cattle.config_item_status.applied_updated</code>.
     */
    @Column(name = "applied_updated")
    @Override
    public Date getAppliedUpdated() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>cattle.config_item_status.agent_id</code>.
     */
    @Override
    public void setAgentId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>cattle.config_item_status.agent_id</code>.
     */
    @Column(name = "agent_id", precision = 19)
    @Override
    public Long getAgentId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>cattle.config_item_status.account_id</code>.
     */
    @Override
    public void setAccountId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>cattle.config_item_status.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    @Override
    public Long getAccountId() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>cattle.config_item_status.service_id</code>.
     */
    @Override
    public void setServiceId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>cattle.config_item_status.service_id</code>.
     */
    @Column(name = "service_id", precision = 19)
    @Override
    public Long getServiceId() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>cattle.config_item_status.resource_id</code>.
     */
    @Override
    public void setResourceId(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>cattle.config_item_status.resource_id</code>.
     */
    @Column(name = "resource_id", nullable = false, precision = 19)
    @Override
    public Long getResourceId() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>cattle.config_item_status.resource_type</code>.
     */
    @Override
    public void setResourceType(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>cattle.config_item_status.resource_type</code>.
     */
    @Column(name = "resource_type", nullable = false, length = 128)
    @Override
    public String getResourceType() {
        return (String) get(11);
    }

    /**
     * Setter for <code>cattle.config_item_status.environment_id</code>.
     */
    @Override
    public void setStackId(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>cattle.config_item_status.environment_id</code>.
     */
    @Column(name = "environment_id", precision = 19)
    @Override
    public Long getStackId() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>cattle.config_item_status.host_id</code>.
     */
    @Override
    public void setHostId(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>cattle.config_item_status.host_id</code>.
     */
    @Column(name = "host_id", precision = 19)
    @Override
    public Long getHostId() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>cattle.config_item_status.deployment_unit_id</code>.
     */
    @Override
    public void setDeploymentUnitId(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>cattle.config_item_status.deployment_unit_id</code>.
     */
    @Column(name = "deployment_unit_id", precision = 19)
    @Override
    public Long getDeploymentUnitId() {
        return (Long) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, String, Long, Long, String, Date, Date, Long, Long, Long, Long, String, Long, Long, Long> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, String, Long, Long, String, Date, Date, Long, Long, Long, Long, String, Long, Long, Long> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ConfigItemStatusTable.CONFIG_ITEM_STATUS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ConfigItemStatusTable.CONFIG_ITEM_STATUS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return ConfigItemStatusTable.CONFIG_ITEM_STATUS.REQUESTED_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return ConfigItemStatusTable.CONFIG_ITEM_STATUS.APPLIED_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ConfigItemStatusTable.CONFIG_ITEM_STATUS.SOURCE_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return ConfigItemStatusTable.CONFIG_ITEM_STATUS.REQUESTED_UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return ConfigItemStatusTable.CONFIG_ITEM_STATUS.APPLIED_UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return ConfigItemStatusTable.CONFIG_ITEM_STATUS.AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return ConfigItemStatusTable.CONFIG_ITEM_STATUS.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return ConfigItemStatusTable.CONFIG_ITEM_STATUS.SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return ConfigItemStatusTable.CONFIG_ITEM_STATUS.RESOURCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ConfigItemStatusTable.CONFIG_ITEM_STATUS.RESOURCE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return ConfigItemStatusTable.CONFIG_ITEM_STATUS.STACK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return ConfigItemStatusTable.CONFIG_ITEM_STATUS.HOST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field15() {
        return ConfigItemStatusTable.CONFIG_ITEM_STATUS.DEPLOYMENT_UNIT_ID;
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
        return getRequestedVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getAppliedVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSourceVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getRequestedUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getAppliedUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getResourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getResourceType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getStackId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getHostId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value15() {
        return getDeploymentUnitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemStatusRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemStatusRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemStatusRecord value3(Long value) {
        setRequestedVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemStatusRecord value4(Long value) {
        setAppliedVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemStatusRecord value5(String value) {
        setSourceVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemStatusRecord value6(Date value) {
        setRequestedUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemStatusRecord value7(Date value) {
        setAppliedUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemStatusRecord value8(Long value) {
        setAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemStatusRecord value9(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemStatusRecord value10(Long value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemStatusRecord value11(Long value) {
        setResourceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemStatusRecord value12(String value) {
        setResourceType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemStatusRecord value13(Long value) {
        setStackId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemStatusRecord value14(Long value) {
        setHostId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemStatusRecord value15(Long value) {
        setDeploymentUnitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemStatusRecord values(Long value1, String value2, Long value3, Long value4, String value5, Date value6, Date value7, Long value8, Long value9, Long value10, Long value11, String value12, Long value13, Long value14, Long value15) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ConfigItemStatus from) {
        setId(from.getId());
        setName(from.getName());
        setRequestedVersion(from.getRequestedVersion());
        setAppliedVersion(from.getAppliedVersion());
        setSourceVersion(from.getSourceVersion());
        setRequestedUpdated(from.getRequestedUpdated());
        setAppliedUpdated(from.getAppliedUpdated());
        setAgentId(from.getAgentId());
        setAccountId(from.getAccountId());
        setServiceId(from.getServiceId());
        setResourceId(from.getResourceId());
        setResourceType(from.getResourceType());
        setStackId(from.getStackId());
        setHostId(from.getHostId());
        setDeploymentUnitId(from.getDeploymentUnitId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ConfigItemStatus> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConfigItemStatusRecord
     */
    public ConfigItemStatusRecord() {
        super(ConfigItemStatusTable.CONFIG_ITEM_STATUS);
    }

    /**
     * Create a detached, initialised ConfigItemStatusRecord
     */
    public ConfigItemStatusRecord(Long id, String name, Long requestedVersion, Long appliedVersion, String sourceVersion, Date requestedUpdated, Date appliedUpdated, Long agentId, Long accountId, Long serviceId, Long resourceId, String resourceType, Long environmentId, Long hostId, Long deploymentUnitId) {
        super(ConfigItemStatusTable.CONFIG_ITEM_STATUS);

        set(0, id);
        set(1, name);
        set(2, requestedVersion);
        set(3, appliedVersion);
        set(4, sourceVersion);
        set(5, requestedUpdated);
        set(6, appliedUpdated);
        set(7, agentId);
        set(8, accountId);
        set(9, serviceId);
        set(10, resourceId);
        set(11, resourceType);
        set(12, environmentId);
        set(13, hostId);
        set(14, deploymentUnitId);
    }
}
