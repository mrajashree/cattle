/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.CertificateRecord;
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
public class CertificateTable extends TableImpl<CertificateRecord> {

    private static final long serialVersionUID = -783061688;

    /**
     * The reference instance of <code>cattle.certificate</code>
     */
    public static final CertificateTable CERTIFICATE = new CertificateTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CertificateRecord> getRecordType() {
        return CertificateRecord.class;
    }

    /**
     * The column <code>cattle.certificate.id</code>.
     */
    public final TableField<CertificateRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.certificate.name</code>.
     */
    public final TableField<CertificateRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.certificate.account_id</code>.
     */
    public final TableField<CertificateRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.certificate.kind</code>.
     */
    public final TableField<CertificateRecord, String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>cattle.certificate.uuid</code>.
     */
    public final TableField<CertificateRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.certificate.description</code>.
     */
    public final TableField<CertificateRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>cattle.certificate.state</code>.
     */
    public final TableField<CertificateRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.certificate.created</code>.
     */
    public final TableField<CertificateRecord, Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.certificate.removed</code>.
     */
    public final TableField<CertificateRecord, Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.certificate.remove_time</code>.
     */
    public final TableField<CertificateRecord, Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.certificate.data</code>.
     */
    public final TableField<CertificateRecord, Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB, this, "", new DataConverter());

    /**
     * The column <code>cattle.certificate.cert_chain</code>.
     */
    public final TableField<CertificateRecord, String> CERT_CHAIN = createField("cert_chain", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>cattle.certificate.cert</code>.
     */
    public final TableField<CertificateRecord, String> CERT = createField("cert", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>cattle.certificate.key</code>.
     */
    public final TableField<CertificateRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>cattle.certificate</code> table reference
     */
    public CertificateTable() {
        this("certificate", null);
    }

    /**
     * Create an aliased <code>cattle.certificate</code> table reference
     */
    public CertificateTable(String alias) {
        this(alias, CERTIFICATE);
    }

    private CertificateTable(String alias, Table<CertificateRecord> aliased) {
        this(alias, aliased, null);
    }

    private CertificateTable(String alias, Table<CertificateRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CertificateRecord, Long> getIdentity() {
        return Keys.IDENTITY_CERTIFICATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CertificateRecord> getPrimaryKey() {
        return Keys.KEY_CERTIFICATE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CertificateRecord>> getKeys() {
        return Arrays.<UniqueKey<CertificateRecord>>asList(Keys.KEY_CERTIFICATE_PRIMARY, Keys.KEY_CERTIFICATE_IDX_CERT_DATA_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CertificateRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CertificateRecord, ?>>asList(Keys.FK_CERT_DATA__ACCOUNT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificateTable as(String alias) {
        return new CertificateTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CertificateTable rename(String name) {
        return new CertificateTable(name, null);
    }
}
