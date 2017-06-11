/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.DatabasechangeloglockRecord;
import io.cattle.platform.db.jooq.converter.DateConverter;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class DatabasechangeloglockTable extends TableImpl<DatabasechangeloglockRecord> {

    private static final long serialVersionUID = -369941262;

    /**
     * The reference instance of <code>cattle.DATABASECHANGELOGLOCK</code>
     */
    public static final DatabasechangeloglockTable DATABASECHANGELOGLOCK = new DatabasechangeloglockTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatabasechangeloglockRecord> getRecordType() {
        return DatabasechangeloglockRecord.class;
    }

    /**
     * The column <code>cattle.DATABASECHANGELOGLOCK.ID</code>.
     */
    public final TableField<DatabasechangeloglockRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>cattle.DATABASECHANGELOGLOCK.LOCKED</code>.
     */
    public final TableField<DatabasechangeloglockRecord, Boolean> LOCKED = createField("LOCKED", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>cattle.DATABASECHANGELOGLOCK.LOCKGRANTED</code>.
     */
    public final TableField<DatabasechangeloglockRecord, Date> LOCKGRANTED = createField("LOCKGRANTED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.DATABASECHANGELOGLOCK.LOCKEDBY</code>.
     */
    public final TableField<DatabasechangeloglockRecord, String> LOCKEDBY = createField("LOCKEDBY", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>cattle.DATABASECHANGELOGLOCK</code> table reference
     */
    public DatabasechangeloglockTable() {
        this("DATABASECHANGELOGLOCK", null);
    }

    /**
     * Create an aliased <code>cattle.DATABASECHANGELOGLOCK</code> table reference
     */
    public DatabasechangeloglockTable(String alias) {
        this(alias, DATABASECHANGELOGLOCK);
    }

    private DatabasechangeloglockTable(String alias, Table<DatabasechangeloglockRecord> aliased) {
        this(alias, aliased, null);
    }

    private DatabasechangeloglockTable(String alias, Table<DatabasechangeloglockRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<DatabasechangeloglockRecord> getPrimaryKey() {
        return Keys.KEY_DATABASECHANGELOGLOCK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DatabasechangeloglockRecord>> getKeys() {
        return Arrays.<UniqueKey<DatabasechangeloglockRecord>>asList(Keys.KEY_DATABASECHANGELOGLOCK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangeloglockTable as(String alias) {
        return new DatabasechangeloglockTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DatabasechangeloglockTable rename(String name) {
        return new DatabasechangeloglockTable(name, null);
    }
}
