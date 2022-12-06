package com.example.demoruleengine;

public class Tenant {
    String tenantType;
    String tenantId;
    String tenantFlow;
    String tenantDB;
    String tenantDbSchema;

    public String getTenantType() {
        return tenantType;
    }

    public void setTenantType(String tenantType) {
        this.tenantType = tenantType;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantFlow() {
        return tenantFlow;
    }

    public void setTenantFlow(String tenantFlow) {
        this.tenantFlow = tenantFlow;
    }

    public String getTenantDB() {
        return tenantDB;
    }

    public void setTenantDB(String tenantDB) {
        this.tenantDB = tenantDB;
    }

    public String getTenantDbSchema() {
        return tenantDbSchema;
    }

    public void setTenantDbSchema(String tenantDbSchema) {
        this.tenantDbSchema = tenantDbSchema;
    }
}
