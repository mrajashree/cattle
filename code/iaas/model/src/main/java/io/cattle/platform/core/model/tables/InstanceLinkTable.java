/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.InstanceLinkRecord;
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
public class InstanceLinkTable extends TableImpl<InstanceLinkRecord> {

    private static final long serialVersionUID = -450230590;

    /**
     * The reference instance of <code>cattle.instance_link</code>
     */
    public static final InstanceLinkTable INSTANCE_LINK = new InstanceLinkTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InstanceLinkRecord> getRecordType() {
        return InstanceLinkRecord.class;
    }

    /**
     * The column <code>cattle.instance_link.id</code>.
     */
    public final TableField<InstanceLinkRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.instance_link.name</code>.
     */
    public final TableField<InstanceLinkRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.instance_link.account_id</code>.
     */
    public final TableField<InstanceLinkRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance_link.kind</code>.
     */
    public final TableField<InstanceLinkRecord, String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>cattle.instance_link.uuid</code>.
     */
    public final TableField<InstanceLinkRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.instance_link.description</code>.
     */
    public final TableField<InstanceLinkRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>cattle.instance_link.state</code>.
     */
    public final TableField<InstanceLinkRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.instance_link.created</code>.
     */
    public final TableField<InstanceLinkRecord, Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.instance_link.removed</code>.
     */
    public final TableField<InstanceLinkRecord, Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.instance_link.remove_time</code>.
     */
    public final TableField<InstanceLinkRecord, Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.instance_link.data</code>.
     */
    public final TableField<InstanceLinkRecord, Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB, this, "", new DataConverter());

    /**
     * The column <code>cattle.instance_link.link_name</code>.
     */
    public final TableField<InstanceLinkRecord, String> LINK_NAME = createField("link_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.instance_link.instance_id</code>.
     */
    public final TableField<InstanceLinkRecord, Long> INSTANCE_ID = createField("instance_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance_link.target_instance_id</code>.
     */
    public final TableField<InstanceLinkRecord, Long> TARGET_INSTANCE_ID = createField("target_instance_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.instance_link.service_consume_map_id</code>.
     */
    public final TableField<InstanceLinkRecord, Long> SERVICE_CONSUME_MAP_ID = createField("service_consume_map_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>cattle.instance_link</code> table reference
     */
    public InstanceLinkTable() {
        this("instance_link", null);
    }

    /**
     * Create an aliased <code>cattle.instance_link</code> table reference
     */
    public InstanceLinkTable(String alias) {
        this(alias, INSTANCE_LINK);
    }

    private InstanceLinkTable(String alias, Table<InstanceLinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private InstanceLinkTable(String alias, Table<InstanceLinkRecord> aliased, Field<?>[] parameters) {
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
    public Identity<InstanceLinkRecord, Long> getIdentity() {
        return Keys.IDENTITY_INSTANCE_LINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InstanceLinkRecord> getPrimaryKey() {
        return Keys.KEY_INSTANCE_LINK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InstanceLinkRecord>> getKeys() {
        return Arrays.<UniqueKey<InstanceLinkRecord>>asList(Keys.KEY_INSTANCE_LINK_PRIMARY, Keys.KEY_INSTANCE_LINK_IDX_LINK_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<InstanceLinkRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<InstanceLinkRecord, ?>>asList(Keys.FK_LINK__ACCOUNT_ID, Keys.FK_LINK__INSTANCE_ID, Keys.FK_LINK__TARGET_INSTANCE_ID, Keys.FK_LINK__SERVICE_CONSUME_MAP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkTable as(String alias) {
        return new InstanceLinkTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InstanceLinkTable rename(String name) {
        return new InstanceLinkTable(name, null);
    }
}
