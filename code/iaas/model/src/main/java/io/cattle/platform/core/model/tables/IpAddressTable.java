/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.IpAddressRecord;
import io.cattle.platform.db.jooq.converter.DataConverter;
import io.cattle.platform.db.jooq.converter.DateConverter;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class IpAddressTable extends TableImpl<IpAddressRecord> {

    private static final long serialVersionUID = -2096522364;

    /**
     * The reference instance of <code>cattle.ip_address</code>
     */
    public static final IpAddressTable IP_ADDRESS = new IpAddressTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IpAddressRecord> getRecordType() {
        return IpAddressRecord.class;
    }

    /**
     * The column <code>cattle.ip_address.id</code>.
     */
    public final TableField<IpAddressRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.ip_address.name</code>.
     */
    public final TableField<IpAddressRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.ip_address.account_id</code>.
     */
    public final TableField<IpAddressRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.ip_address.kind</code>.
     */
    public final TableField<IpAddressRecord, String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>cattle.ip_address.uuid</code>.
     */
    public final TableField<IpAddressRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.ip_address.description</code>.
     */
    public final TableField<IpAddressRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>cattle.ip_address.state</code>.
     */
    public final TableField<IpAddressRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.ip_address.created</code>.
     */
    public final TableField<IpAddressRecord, Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.ip_address.removed</code>.
     */
    public final TableField<IpAddressRecord, Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.ip_address.remove_time</code>.
     */
    public final TableField<IpAddressRecord, Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.ip_address.data</code>.
     */
    public final TableField<IpAddressRecord, Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB, this, "", new DataConverter());

    /**
     * The column <code>cattle.ip_address.address</code>.
     */
    public final TableField<IpAddressRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.ip_address.subnet_id</code>.
     */
    public final TableField<IpAddressRecord, Long> SUBNET_ID = createField("subnet_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.ip_address.network_id</code>.
     */
    public final TableField<IpAddressRecord, Long> NETWORK_ID = createField("network_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.ip_address.is_public</code>.
     */
    public final TableField<IpAddressRecord, Boolean> IS_PUBLIC = createField("is_public", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>cattle.ip_address.role</code>.
     */
    public final TableField<IpAddressRecord, String> ROLE = createField("role", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>cattle.ip_address.hostname</code>.
     */
    public final TableField<IpAddressRecord, String> HOSTNAME = createField("hostname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>cattle.ip_address</code> table reference
     */
    public IpAddressTable() {
        this("ip_address", null);
    }

    /**
     * Create an aliased <code>cattle.ip_address</code> table reference
     */
    public IpAddressTable(String alias) {
        this(alias, IP_ADDRESS);
    }

    private IpAddressTable(String alias, Table<IpAddressRecord> aliased) {
        this(alias, aliased, null);
    }

    private IpAddressTable(String alias, Table<IpAddressRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return CattleTable.CATTLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<IpAddressRecord, Long> getIdentity() {
        return Keys.IDENTITY_IP_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IpAddressRecord> getPrimaryKey() {
        return Keys.KEY_IP_ADDRESS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IpAddressRecord>> getKeys() {
        return Arrays.<UniqueKey<IpAddressRecord>>asList(Keys.KEY_IP_ADDRESS_PRIMARY, Keys.KEY_IP_ADDRESS_IDX_IP_ADDRESS_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<IpAddressRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<IpAddressRecord, ?>>asList(Keys.FK_IP_ADDRESS__ACCOUNT_ID, Keys.FK_IP_ADDRESS__SUBNET_ID, Keys.FK_IP_ADDRESS__NETWORK_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IpAddressTable as(String alias) {
        return new IpAddressTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IpAddressTable rename(String name) {
        return new IpAddressTable(name, null);
    }
}
