package com.iqes.entity;

import javax.persistence.*;

@Table(name = "TABLE_NUMBER")
@Entity
public class TableNumber extends IdEntity{

    private String name;
    private TableType tableType;

    @JoinColumn(name = "table_type_id")
    @ManyToOne
    public TableType getTableType() {
        return tableType;
    }

    public void setTableType(TableType tableType) {
        this.tableType = tableType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
