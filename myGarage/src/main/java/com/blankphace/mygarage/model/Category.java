
package com.blankphace.mygarage.model;

import java.util.Objects;

public class Category {
    private int part_id;
    private int category_id;
    private String type;
    private String typeDetail;
    private String application;
    private String applicationDetail;
    private String condition;
    private int quantity;
    private String notes;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.part_id;
        hash = 47 * hash + this.category_id;
        hash = 47 * hash + Objects.hashCode(this.type);
        hash = 47 * hash + Objects.hashCode(this.typeDetail);
        hash = 47 * hash + Objects.hashCode(this.application);
        hash = 47 * hash + Objects.hashCode(this.applicationDetail);
        hash = 47 * hash + Objects.hashCode(this.condition);
        hash = 47 * hash + this.quantity;
        hash = 47 * hash + Objects.hashCode(this.notes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Category other = (Category) obj;
        if (this.part_id != other.part_id) {
            return false;
        }
        if (this.category_id != other.category_id) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.typeDetail, other.typeDetail)) {
            return false;
        }
        if (!Objects.equals(this.application, other.application)) {
            return false;
        }
        if (!Objects.equals(this.applicationDetail, other.applicationDetail)) {
            return false;
        }
        if (!Objects.equals(this.condition, other.condition)) {
            return false;
        }
        if (!Objects.equals(this.notes, other.notes)) {
            return false;
        }
        return true;
    }
    
    public int getPart_id() {
        return part_id;
    }

    public void setPart_id(int part_id) {
        this.part_id = part_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDetail() {
        return typeDetail;
    }

    public void setTypeDetail(String typeDetail) {
        this.typeDetail = typeDetail;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getApplicationDetail() {
        return applicationDetail;
    }

    public void setApplicationDetail(String applicationDetail) {
        this.applicationDetail = applicationDetail;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
