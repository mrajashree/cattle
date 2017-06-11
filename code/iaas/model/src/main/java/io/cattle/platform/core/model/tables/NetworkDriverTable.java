/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.NetworkDriverRecord;
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
public class NetworkDriverTable extends TableImpl<NetworkDriverRecord> {

    private static final long serialVersionUID = -61119443;

    /**
     * The reference instance of <code>cattle.network_driver</code>
     */
    public static final NetworkDriverTable NETWORK_DRIVER = new NetworkDriverTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NetworkDriverRecord> getRecordType() {
        return NetworkDriverRecord.class;
    }

    /**
     * The column <code>cattle.network_driver.id</code>.
     */
    public final TableField<NetworkDriverRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.network_driver.name</code>.
     */
    public final TableField<NetworkDriverRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.network_driver.account_id</code>.
     */
    public final TableField<NetworkDriverRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.network_driver.kind</code>.
     */
    public final TableField<NetworkDriverRecord, String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>cattle.network_driver.uuid</code>.
     */
    public final TableField<NetworkDriverRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.network_driver.description</code>.
     */
    public final TableField<NetworkDriverRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>cattle.network_driver.state</code>.
     */
    public final TableField<NetworkDriverRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.network_driver.created</code>.
     */
    public final TableField<NetworkDriverRecord, Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.network_driver.removed</code>.
     */
    public final TableField<NetworkDriverRecord, Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.network_driver.remove_time</code>.
     */
    public final TableField<NetworkDriverRecord, Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.network_driver.data</code>.
     */
    public final TableField<NetworkDriverRecord, Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB, this, "", new DataConverter());

    /**
     * The column <code>cattle.network_driver.service_id</code>.
     */
    public final TableField<NetworkDriverRecord, Long> SERVICE_ID = createField("service_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>cattle.network_driver</code> table reference
     */
    public NetworkDriverTable() {
        this("network_driver", null);
    }

    /**
     * Create an aliased <code>cattle.network_driver</code> table reference
     */
    public NetworkDriverTable(String alias) {
        this(alias, NETWORK_DRIVER);
    }

    private NetworkDriverTable(String alias, Table<NetworkDriverRecord> aliased) {
        this(alias, aliased, null);
    }

    private NetworkDriverTable(String alias, Table<NetworkDriverRecord> aliased, Field<?>[] parameters) {
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
    public Identity<NetworkDriverRecord, Long> getIdentity() {
        return Keys.IDENTITY_NETWORK_DRIVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<NetworkDriverRecord> getPrimaryKey() {
        return Keys.KEY_NETWORK_DRIVER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<NetworkDriverRecord>> getKeys() {
        return Arrays.<UniqueKey<NetworkDriverRecord>>asList(Keys.KEY_NETWORK_DRIVER_PRIMARY, Keys.KEY_NETWORK_DRIVER_IDX_NETWORK_DRIVER_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<NetworkDriverRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<NetworkDriverRecord, ?>>asList(Keys.FK_NETWORK_DRIVER__ACCOUNT_ID, Keys.FK_NETWORK_DRIVER__SERVICE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkDriverTable as(String alias) {
        return new NetworkDriverTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public NetworkDriverTable rename(String name) {
        return new NetworkDriverTable(name, null);
    }
}
