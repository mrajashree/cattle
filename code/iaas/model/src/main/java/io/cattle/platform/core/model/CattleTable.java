/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model;


import io.cattle.platform.core.model.tables.AccountLinkTable;
import io.cattle.platform.core.model.tables.AccountTable;
import io.cattle.platform.core.model.tables.AgentTable;
import io.cattle.platform.core.model.tables.AuditLogTable;
import io.cattle.platform.core.model.tables.AuthTokenTable;
import io.cattle.platform.core.model.tables.BackoffTable;
import io.cattle.platform.core.model.tables.CertificateTable;
import io.cattle.platform.core.model.tables.ClusterHostMapTable;
import io.cattle.platform.core.model.tables.ClusterMembershipTable;
import io.cattle.platform.core.model.tables.ConfigItemStatusTable;
import io.cattle.platform.core.model.tables.ConfigItemTable;
import io.cattle.platform.core.model.tables.ContainerEventTable;
import io.cattle.platform.core.model.tables.CredentialTable;
import io.cattle.platform.core.model.tables.DataTable;
import io.cattle.platform.core.model.tables.DatabasechangelogTable;
import io.cattle.platform.core.model.tables.DatabasechangeloglockTable;
import io.cattle.platform.core.model.tables.DeploymentUnitTable;
import io.cattle.platform.core.model.tables.DynamicSchemaRoleTable;
import io.cattle.platform.core.model.tables.DynamicSchemaTable;
import io.cattle.platform.core.model.tables.ExternalEventTable;
import io.cattle.platform.core.model.tables.ExternalHandlerExternalHandlerProcessMapTable;
import io.cattle.platform.core.model.tables.ExternalHandlerProcessTable;
import io.cattle.platform.core.model.tables.ExternalHandlerTable;
import io.cattle.platform.core.model.tables.GenericObjectTable;
import io.cattle.platform.core.model.tables.HealthcheckInstanceHostMapTable;
import io.cattle.platform.core.model.tables.HealthcheckInstanceTable;
import io.cattle.platform.core.model.tables.HostIpAddressMapTable;
import io.cattle.platform.core.model.tables.HostLabelMapTable;
import io.cattle.platform.core.model.tables.HostTable;
import io.cattle.platform.core.model.tables.HostTemplateTable;
import io.cattle.platform.core.model.tables.ImageStoragePoolMapTable;
import io.cattle.platform.core.model.tables.ImageTable;
import io.cattle.platform.core.model.tables.InstanceHostMapTable;
import io.cattle.platform.core.model.tables.InstanceLabelMapTable;
import io.cattle.platform.core.model.tables.InstanceLinkTable;
import io.cattle.platform.core.model.tables.InstanceTable;
import io.cattle.platform.core.model.tables.IpAddressNicMapTable;
import io.cattle.platform.core.model.tables.IpAddressTable;
import io.cattle.platform.core.model.tables.LabelTable;
import io.cattle.platform.core.model.tables.MachineDriverTable;
import io.cattle.platform.core.model.tables.MountTable;
import io.cattle.platform.core.model.tables.NetworkDriverTable;
import io.cattle.platform.core.model.tables.NetworkTable;
import io.cattle.platform.core.model.tables.NicTable;
import io.cattle.platform.core.model.tables.PhysicalHostTable;
import io.cattle.platform.core.model.tables.PortTable;
import io.cattle.platform.core.model.tables.ProcessExecutionTable;
import io.cattle.platform.core.model.tables.ProcessInstanceTable;
import io.cattle.platform.core.model.tables.ProjectMemberTable;
import io.cattle.platform.core.model.tables.ProjectTemplateTable;
import io.cattle.platform.core.model.tables.ResourcePoolTable;
import io.cattle.platform.core.model.tables.RevisionTable;
import io.cattle.platform.core.model.tables.ScheduledUpgradeTable;
import io.cattle.platform.core.model.tables.SecretTable;
import io.cattle.platform.core.model.tables.ServiceConsumeMapTable;
import io.cattle.platform.core.model.tables.ServiceEventTable;
import io.cattle.platform.core.model.tables.ServiceExposeMapTable;
import io.cattle.platform.core.model.tables.ServiceIndexTable;
import io.cattle.platform.core.model.tables.ServiceLogTable;
import io.cattle.platform.core.model.tables.ServiceTable;
import io.cattle.platform.core.model.tables.SettingTable;
import io.cattle.platform.core.model.tables.StackTable;
import io.cattle.platform.core.model.tables.StorageDriverTable;
import io.cattle.platform.core.model.tables.StoragePoolHostMapTable;
import io.cattle.platform.core.model.tables.StoragePoolTable;
import io.cattle.platform.core.model.tables.SubnetTable;
import io.cattle.platform.core.model.tables.TaskInstanceTable;
import io.cattle.platform.core.model.tables.TaskTable;
import io.cattle.platform.core.model.tables.UserPreferenceTable;
import io.cattle.platform.core.model.tables.VolumeStoragePoolMapTable;
import io.cattle.platform.core.model.tables.VolumeTable;
import io.cattle.platform.core.model.tables.VolumeTemplateTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class CattleTable extends SchemaImpl {

    private static final long serialVersionUID = 10749764;

    /**
     * The reference instance of <code>cattle</code>
     */
    public static final CattleTable CATTLE = new CattleTable();

    /**
     * The table <code>cattle.account</code>.
     */
    public final AccountTable ACCOUNT = io.cattle.platform.core.model.tables.AccountTable.ACCOUNT;

    /**
     * The table <code>cattle.account_link</code>.
     */
    public final AccountLinkTable ACCOUNT_LINK = io.cattle.platform.core.model.tables.AccountLinkTable.ACCOUNT_LINK;

    /**
     * The table <code>cattle.agent</code>.
     */
    public final AgentTable AGENT = io.cattle.platform.core.model.tables.AgentTable.AGENT;

    /**
     * The table <code>cattle.audit_log</code>.
     */
    public final AuditLogTable AUDIT_LOG = io.cattle.platform.core.model.tables.AuditLogTable.AUDIT_LOG;

    /**
     * The table <code>cattle.auth_token</code>.
     */
    public final AuthTokenTable AUTH_TOKEN = io.cattle.platform.core.model.tables.AuthTokenTable.AUTH_TOKEN;

    /**
     * The table <code>cattle.backoff</code>.
     */
    public final BackoffTable BACKOFF = io.cattle.platform.core.model.tables.BackoffTable.BACKOFF;

    /**
     * The table <code>cattle.certificate</code>.
     */
    public final CertificateTable CERTIFICATE = io.cattle.platform.core.model.tables.CertificateTable.CERTIFICATE;

    /**
     * The table <code>cattle.cluster_host_map</code>.
     */
    public final ClusterHostMapTable CLUSTER_HOST_MAP = io.cattle.platform.core.model.tables.ClusterHostMapTable.CLUSTER_HOST_MAP;

    /**
     * The table <code>cattle.cluster_membership</code>.
     */
    public final ClusterMembershipTable CLUSTER_MEMBERSHIP = io.cattle.platform.core.model.tables.ClusterMembershipTable.CLUSTER_MEMBERSHIP;

    /**
     * The table <code>cattle.config_item</code>.
     */
    public final ConfigItemTable CONFIG_ITEM = io.cattle.platform.core.model.tables.ConfigItemTable.CONFIG_ITEM;

    /**
     * The table <code>cattle.config_item_status</code>.
     */
    public final ConfigItemStatusTable CONFIG_ITEM_STATUS = io.cattle.platform.core.model.tables.ConfigItemStatusTable.CONFIG_ITEM_STATUS;

    /**
     * The table <code>cattle.container_event</code>.
     */
    public final ContainerEventTable CONTAINER_EVENT = io.cattle.platform.core.model.tables.ContainerEventTable.CONTAINER_EVENT;

    /**
     * The table <code>cattle.credential</code>.
     */
    public final CredentialTable CREDENTIAL = io.cattle.platform.core.model.tables.CredentialTable.CREDENTIAL;

    /**
     * The table <code>cattle.data</code>.
     */
    public final DataTable DATA = io.cattle.platform.core.model.tables.DataTable.DATA;

    /**
     * The table <code>cattle.DATABASECHANGELOG</code>.
     */
    public final DatabasechangelogTable DATABASECHANGELOG = io.cattle.platform.core.model.tables.DatabasechangelogTable.DATABASECHANGELOG;

    /**
     * The table <code>cattle.DATABASECHANGELOGLOCK</code>.
     */
    public final DatabasechangeloglockTable DATABASECHANGELOGLOCK = io.cattle.platform.core.model.tables.DatabasechangeloglockTable.DATABASECHANGELOGLOCK;

    /**
     * The table <code>cattle.deployment_unit</code>.
     */
    public final DeploymentUnitTable DEPLOYMENT_UNIT = io.cattle.platform.core.model.tables.DeploymentUnitTable.DEPLOYMENT_UNIT;

    /**
     * The table <code>cattle.dynamic_schema</code>.
     */
    public final DynamicSchemaTable DYNAMIC_SCHEMA = io.cattle.platform.core.model.tables.DynamicSchemaTable.DYNAMIC_SCHEMA;

    /**
     * The table <code>cattle.dynamic_schema_role</code>.
     */
    public final DynamicSchemaRoleTable DYNAMIC_SCHEMA_ROLE = io.cattle.platform.core.model.tables.DynamicSchemaRoleTable.DYNAMIC_SCHEMA_ROLE;

    /**
     * The table <code>cattle.environment</code>.
     */
    public final StackTable STACK = io.cattle.platform.core.model.tables.StackTable.STACK;

    /**
     * The table <code>cattle.external_event</code>.
     */
    public final ExternalEventTable EXTERNAL_EVENT = io.cattle.platform.core.model.tables.ExternalEventTable.EXTERNAL_EVENT;

    /**
     * The table <code>cattle.external_handler</code>.
     */
    public final ExternalHandlerTable EXTERNAL_HANDLER = io.cattle.platform.core.model.tables.ExternalHandlerTable.EXTERNAL_HANDLER;

    /**
     * The table <code>cattle.external_handler_external_handler_process_map</code>.
     */
    public final ExternalHandlerExternalHandlerProcessMapTable EXTERNAL_HANDLER_EXTERNAL_HANDLER_PROCESS_MAP = io.cattle.platform.core.model.tables.ExternalHandlerExternalHandlerProcessMapTable.EXTERNAL_HANDLER_EXTERNAL_HANDLER_PROCESS_MAP;

    /**
     * The table <code>cattle.external_handler_process</code>.
     */
    public final ExternalHandlerProcessTable EXTERNAL_HANDLER_PROCESS = io.cattle.platform.core.model.tables.ExternalHandlerProcessTable.EXTERNAL_HANDLER_PROCESS;

    /**
     * The table <code>cattle.generic_object</code>.
     */
    public final GenericObjectTable GENERIC_OBJECT = io.cattle.platform.core.model.tables.GenericObjectTable.GENERIC_OBJECT;

    /**
     * The table <code>cattle.healthcheck_instance</code>.
     */
    public final HealthcheckInstanceTable HEALTHCHECK_INSTANCE = io.cattle.platform.core.model.tables.HealthcheckInstanceTable.HEALTHCHECK_INSTANCE;

    /**
     * The table <code>cattle.healthcheck_instance_host_map</code>.
     */
    public final HealthcheckInstanceHostMapTable HEALTHCHECK_INSTANCE_HOST_MAP = io.cattle.platform.core.model.tables.HealthcheckInstanceHostMapTable.HEALTHCHECK_INSTANCE_HOST_MAP;

    /**
     * The table <code>cattle.host</code>.
     */
    public final HostTable HOST = io.cattle.platform.core.model.tables.HostTable.HOST;

    /**
     * The table <code>cattle.host_ip_address_map</code>.
     */
    public final HostIpAddressMapTable HOST_IP_ADDRESS_MAP = io.cattle.platform.core.model.tables.HostIpAddressMapTable.HOST_IP_ADDRESS_MAP;

    /**
     * The table <code>cattle.host_label_map</code>.
     */
    public final HostLabelMapTable HOST_LABEL_MAP = io.cattle.platform.core.model.tables.HostLabelMapTable.HOST_LABEL_MAP;

    /**
     * The table <code>cattle.host_template</code>.
     */
    public final HostTemplateTable HOST_TEMPLATE = io.cattle.platform.core.model.tables.HostTemplateTable.HOST_TEMPLATE;

    /**
     * The table <code>cattle.image</code>.
     */
    public final ImageTable IMAGE = io.cattle.platform.core.model.tables.ImageTable.IMAGE;

    /**
     * The table <code>cattle.image_storage_pool_map</code>.
     */
    public final ImageStoragePoolMapTable IMAGE_STORAGE_POOL_MAP = io.cattle.platform.core.model.tables.ImageStoragePoolMapTable.IMAGE_STORAGE_POOL_MAP;

    /**
     * The table <code>cattle.instance</code>.
     */
    public final InstanceTable INSTANCE = io.cattle.platform.core.model.tables.InstanceTable.INSTANCE;

    /**
     * The table <code>cattle.instance_host_map</code>.
     */
    public final InstanceHostMapTable INSTANCE_HOST_MAP = io.cattle.platform.core.model.tables.InstanceHostMapTable.INSTANCE_HOST_MAP;

    /**
     * The table <code>cattle.instance_label_map</code>.
     */
    public final InstanceLabelMapTable INSTANCE_LABEL_MAP = io.cattle.platform.core.model.tables.InstanceLabelMapTable.INSTANCE_LABEL_MAP;

    /**
     * The table <code>cattle.instance_link</code>.
     */
    public final InstanceLinkTable INSTANCE_LINK = io.cattle.platform.core.model.tables.InstanceLinkTable.INSTANCE_LINK;

    /**
     * The table <code>cattle.ip_address</code>.
     */
    public final IpAddressTable IP_ADDRESS = io.cattle.platform.core.model.tables.IpAddressTable.IP_ADDRESS;

    /**
     * The table <code>cattle.ip_address_nic_map</code>.
     */
    public final IpAddressNicMapTable IP_ADDRESS_NIC_MAP = io.cattle.platform.core.model.tables.IpAddressNicMapTable.IP_ADDRESS_NIC_MAP;

    /**
     * The table <code>cattle.label</code>.
     */
    public final LabelTable LABEL = io.cattle.platform.core.model.tables.LabelTable.LABEL;

    /**
     * The table <code>cattle.machine_driver</code>.
     */
    public final MachineDriverTable MACHINE_DRIVER = io.cattle.platform.core.model.tables.MachineDriverTable.MACHINE_DRIVER;

    /**
     * The table <code>cattle.mount</code>.
     */
    public final MountTable MOUNT = io.cattle.platform.core.model.tables.MountTable.MOUNT;

    /**
     * The table <code>cattle.network</code>.
     */
    public final NetworkTable NETWORK = io.cattle.platform.core.model.tables.NetworkTable.NETWORK;

    /**
     * The table <code>cattle.network_driver</code>.
     */
    public final NetworkDriverTable NETWORK_DRIVER = io.cattle.platform.core.model.tables.NetworkDriverTable.NETWORK_DRIVER;

    /**
     * The table <code>cattle.nic</code>.
     */
    public final NicTable NIC = io.cattle.platform.core.model.tables.NicTable.NIC;

    /**
     * The table <code>cattle.physical_host</code>.
     */
    public final PhysicalHostTable PHYSICAL_HOST = io.cattle.platform.core.model.tables.PhysicalHostTable.PHYSICAL_HOST;

    /**
     * The table <code>cattle.port</code>.
     */
    public final PortTable PORT = io.cattle.platform.core.model.tables.PortTable.PORT;

    /**
     * The table <code>cattle.process_execution</code>.
     */
    public final ProcessExecutionTable PROCESS_EXECUTION = io.cattle.platform.core.model.tables.ProcessExecutionTable.PROCESS_EXECUTION;

    /**
     * The table <code>cattle.process_instance</code>.
     */
    public final ProcessInstanceTable PROCESS_INSTANCE = io.cattle.platform.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE;

    /**
     * The table <code>cattle.project_member</code>.
     */
    public final ProjectMemberTable PROJECT_MEMBER = io.cattle.platform.core.model.tables.ProjectMemberTable.PROJECT_MEMBER;

    /**
     * The table <code>cattle.project_template</code>.
     */
    public final ProjectTemplateTable PROJECT_TEMPLATE = io.cattle.platform.core.model.tables.ProjectTemplateTable.PROJECT_TEMPLATE;

    /**
     * The table <code>cattle.resource_pool</code>.
     */
    public final ResourcePoolTable RESOURCE_POOL = io.cattle.platform.core.model.tables.ResourcePoolTable.RESOURCE_POOL;

    /**
     * The table <code>cattle.revision</code>.
     */
    public final RevisionTable REVISION = io.cattle.platform.core.model.tables.RevisionTable.REVISION;

    /**
     * The table <code>cattle.scheduled_upgrade</code>.
     */
    public final ScheduledUpgradeTable SCHEDULED_UPGRADE = io.cattle.platform.core.model.tables.ScheduledUpgradeTable.SCHEDULED_UPGRADE;

    /**
     * The table <code>cattle.secret</code>.
     */
    public final SecretTable SECRET = io.cattle.platform.core.model.tables.SecretTable.SECRET;

    /**
     * The table <code>cattle.service</code>.
     */
    public final ServiceTable SERVICE = io.cattle.platform.core.model.tables.ServiceTable.SERVICE;

    /**
     * The table <code>cattle.service_consume_map</code>.
     */
    public final ServiceConsumeMapTable SERVICE_CONSUME_MAP = io.cattle.platform.core.model.tables.ServiceConsumeMapTable.SERVICE_CONSUME_MAP;

    /**
     * The table <code>cattle.service_event</code>.
     */
    public final ServiceEventTable SERVICE_EVENT = io.cattle.platform.core.model.tables.ServiceEventTable.SERVICE_EVENT;

    /**
     * The table <code>cattle.service_expose_map</code>.
     */
    public final ServiceExposeMapTable SERVICE_EXPOSE_MAP = io.cattle.platform.core.model.tables.ServiceExposeMapTable.SERVICE_EXPOSE_MAP;

    /**
     * The table <code>cattle.service_index</code>.
     */
    public final ServiceIndexTable SERVICE_INDEX = io.cattle.platform.core.model.tables.ServiceIndexTable.SERVICE_INDEX;

    /**
     * The table <code>cattle.service_log</code>.
     */
    public final ServiceLogTable SERVICE_LOG = io.cattle.platform.core.model.tables.ServiceLogTable.SERVICE_LOG;

    /**
     * The table <code>cattle.setting</code>.
     */
    public final SettingTable SETTING = io.cattle.platform.core.model.tables.SettingTable.SETTING;

    /**
     * The table <code>cattle.storage_driver</code>.
     */
    public final StorageDriverTable STORAGE_DRIVER = io.cattle.platform.core.model.tables.StorageDriverTable.STORAGE_DRIVER;

    /**
     * The table <code>cattle.storage_pool</code>.
     */
    public final StoragePoolTable STORAGE_POOL = io.cattle.platform.core.model.tables.StoragePoolTable.STORAGE_POOL;

    /**
     * The table <code>cattle.storage_pool_host_map</code>.
     */
    public final StoragePoolHostMapTable STORAGE_POOL_HOST_MAP = io.cattle.platform.core.model.tables.StoragePoolHostMapTable.STORAGE_POOL_HOST_MAP;

    /**
     * The table <code>cattle.subnet</code>.
     */
    public final SubnetTable SUBNET = io.cattle.platform.core.model.tables.SubnetTable.SUBNET;

    /**
     * The table <code>cattle.task</code>.
     */
    public final TaskTable TASK = io.cattle.platform.core.model.tables.TaskTable.TASK;

    /**
     * The table <code>cattle.task_instance</code>.
     */
    public final TaskInstanceTable TASK_INSTANCE = io.cattle.platform.core.model.tables.TaskInstanceTable.TASK_INSTANCE;

    /**
     * The table <code>cattle.user_preference</code>.
     */
    public final UserPreferenceTable USER_PREFERENCE = io.cattle.platform.core.model.tables.UserPreferenceTable.USER_PREFERENCE;

    /**
     * The table <code>cattle.volume</code>.
     */
    public final VolumeTable VOLUME = io.cattle.platform.core.model.tables.VolumeTable.VOLUME;

    /**
     * The table <code>cattle.volume_storage_pool_map</code>.
     */
    public final VolumeStoragePoolMapTable VOLUME_STORAGE_POOL_MAP = io.cattle.platform.core.model.tables.VolumeStoragePoolMapTable.VOLUME_STORAGE_POOL_MAP;

    /**
     * The table <code>cattle.volume_template</code>.
     */
    public final VolumeTemplateTable VOLUME_TEMPLATE = io.cattle.platform.core.model.tables.VolumeTemplateTable.VOLUME_TEMPLATE;

    /**
     * No further instances allowed
     */
    private CattleTable() {
        super("cattle", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            AccountTable.ACCOUNT,
            AccountLinkTable.ACCOUNT_LINK,
            AgentTable.AGENT,
            AuditLogTable.AUDIT_LOG,
            AuthTokenTable.AUTH_TOKEN,
            BackoffTable.BACKOFF,
            CertificateTable.CERTIFICATE,
            ClusterHostMapTable.CLUSTER_HOST_MAP,
            ClusterMembershipTable.CLUSTER_MEMBERSHIP,
            ConfigItemTable.CONFIG_ITEM,
            ConfigItemStatusTable.CONFIG_ITEM_STATUS,
            ContainerEventTable.CONTAINER_EVENT,
            CredentialTable.CREDENTIAL,
            DataTable.DATA,
            DatabasechangelogTable.DATABASECHANGELOG,
            DatabasechangeloglockTable.DATABASECHANGELOGLOCK,
            DeploymentUnitTable.DEPLOYMENT_UNIT,
            DynamicSchemaTable.DYNAMIC_SCHEMA,
            DynamicSchemaRoleTable.DYNAMIC_SCHEMA_ROLE,
            StackTable.STACK,
            ExternalEventTable.EXTERNAL_EVENT,
            ExternalHandlerTable.EXTERNAL_HANDLER,
            ExternalHandlerExternalHandlerProcessMapTable.EXTERNAL_HANDLER_EXTERNAL_HANDLER_PROCESS_MAP,
            ExternalHandlerProcessTable.EXTERNAL_HANDLER_PROCESS,
            GenericObjectTable.GENERIC_OBJECT,
            HealthcheckInstanceTable.HEALTHCHECK_INSTANCE,
            HealthcheckInstanceHostMapTable.HEALTHCHECK_INSTANCE_HOST_MAP,
            HostTable.HOST,
            HostIpAddressMapTable.HOST_IP_ADDRESS_MAP,
            HostLabelMapTable.HOST_LABEL_MAP,
            HostTemplateTable.HOST_TEMPLATE,
            ImageTable.IMAGE,
            ImageStoragePoolMapTable.IMAGE_STORAGE_POOL_MAP,
            InstanceTable.INSTANCE,
            InstanceHostMapTable.INSTANCE_HOST_MAP,
            InstanceLabelMapTable.INSTANCE_LABEL_MAP,
            InstanceLinkTable.INSTANCE_LINK,
            IpAddressTable.IP_ADDRESS,
            IpAddressNicMapTable.IP_ADDRESS_NIC_MAP,
            LabelTable.LABEL,
            MachineDriverTable.MACHINE_DRIVER,
            MountTable.MOUNT,
            NetworkTable.NETWORK,
            NetworkDriverTable.NETWORK_DRIVER,
            NicTable.NIC,
            PhysicalHostTable.PHYSICAL_HOST,
            PortTable.PORT,
            ProcessExecutionTable.PROCESS_EXECUTION,
            ProcessInstanceTable.PROCESS_INSTANCE,
            ProjectMemberTable.PROJECT_MEMBER,
            ProjectTemplateTable.PROJECT_TEMPLATE,
            ResourcePoolTable.RESOURCE_POOL,
            RevisionTable.REVISION,
            ScheduledUpgradeTable.SCHEDULED_UPGRADE,
            SecretTable.SECRET,
            ServiceTable.SERVICE,
            ServiceConsumeMapTable.SERVICE_CONSUME_MAP,
            ServiceEventTable.SERVICE_EVENT,
            ServiceExposeMapTable.SERVICE_EXPOSE_MAP,
            ServiceIndexTable.SERVICE_INDEX,
            ServiceLogTable.SERVICE_LOG,
            SettingTable.SETTING,
            StorageDriverTable.STORAGE_DRIVER,
            StoragePoolTable.STORAGE_POOL,
            StoragePoolHostMapTable.STORAGE_POOL_HOST_MAP,
            SubnetTable.SUBNET,
            TaskTable.TASK,
            TaskInstanceTable.TASK_INSTANCE,
            UserPreferenceTable.USER_PREFERENCE,
            VolumeTable.VOLUME,
            VolumeStoragePoolMapTable.VOLUME_STORAGE_POOL_MAP,
            VolumeTemplateTable.VOLUME_TEMPLATE);
    }
}
