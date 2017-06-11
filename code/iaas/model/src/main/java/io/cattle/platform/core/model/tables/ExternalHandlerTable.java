/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.ExternalHandlerRecord;
import io.cattle.platform.db.jooq.converter.DataConverter;
import io.cattle.platform.db.jooq.converter.DateConverter;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class ExternalHandlerTable extends TableImpl<ExternalHandlerRecord> {

    private static final long serialVersionUID = 1283220516;

    /**
     * The reference instance of <code>cattle.external_handler</code>
     */
    public static final ExternalHandlerTable EXTERNAL_HANDLER = new ExternalHandlerTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExternalHandlerRecord> getRecordType() {
        return ExternalHandlerRecord.class;
    }

    /**
     * The column <code>cattle.external_handler.id</code>.
     */
    public final TableField<ExternalHandlerRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.external_handler.name</code>.
     */
    public final TableField<ExternalHandlerRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.external_handler.kind</code>.
     */
    public final TableField<ExternalHandlerRecord, String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>cattle.external_handler.uuid</code>.
     */
    public final TableField<ExternalHandlerRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.external_handler.description</code>.
     */
    public final TableField<ExternalHandlerRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>cattle.external_handler.state</code>.
     */
    public final TableField<ExternalHandlerRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.external_handler.created</code>.
     */
    public final TableField<ExternalHandlerRecord, Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.external_handler.removed</code>.
     */
    public final TableField<ExternalHandlerRecord, Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.external_handler.remove_time</code>.
     */
    public final TableField<ExternalHandlerRecord, Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.external_handler.data</code>.
     */
    public final TableField<ExternalHandlerRecord, Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB, this, "", new DataConverter());

    /**
     * The column <code>cattle.external_handler.priority</code>.
     */
    public final TableField<ExternalHandlerRecord, Integer> PRIORITY = createField("priority", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>cattle.external_handler</code> table reference
     */
    public ExternalHandlerTable() {
        this("external_handler", null);
    }

    /**
     * Create an aliased <code>cattle.external_handler</code> table reference
     */
    public ExternalHandlerTable(String alias) {
        this(alias, EXTERNAL_HANDLER);
    }

    private ExternalHandlerTable(String alias, Table<ExternalHandlerRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExternalHandlerTable(String alias, Table<ExternalHandlerRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ExternalHandlerRecord, Long> getIdentity() {
        return Keys.IDENTITY_EXTERNAL_HANDLER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ExternalHandlerRecord> getPrimaryKey() {
        return Keys.KEY_EXTERNAL_HANDLER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ExternalHandlerRecord>> getKeys() {
        return Arrays.<UniqueKey<ExternalHandlerRecord>>asList(Keys.KEY_EXTERNAL_HANDLER_PRIMARY, Keys.KEY_EXTERNAL_HANDLER_IDX_EXTERNAL_HANDLER_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalHandlerTable as(String alias) {
        return new ExternalHandlerTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExternalHandlerTable rename(String name) {
        return new ExternalHandlerTable(name, null);
    }
}
