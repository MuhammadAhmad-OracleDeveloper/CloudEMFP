package model.EO;

import oracle.jbo.domain.Number;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jul 27 15:43:59 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblProjOffImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ProjOffId,
        ProjId,
        Name,
        ContactPer,
        Address,
        Tel,
        Fax,
        Email,
        Category,
        Ast,
        Designation,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        CreatedBy,
        TblProj,
        TblTargetCrops;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int PROJOFFID = AttributesEnum.ProjOffId.index();
    public static final int PROJID = AttributesEnum.ProjId.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int CONTACTPER = AttributesEnum.ContactPer.index();
    public static final int ADDRESS = AttributesEnum.Address.index();
    public static final int TEL = AttributesEnum.Tel.index();
    public static final int FAX = AttributesEnum.Fax.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int CATEGORY = AttributesEnum.Category.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int DESIGNATION = AttributesEnum.Designation.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int TBLPROJ = AttributesEnum.TblProj.index();
    public static final int TBLTARGETCROPS = AttributesEnum.TblTargetCrops.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblProjOffImpl() {
    }

    /**
     * Gets the attribute value for ProjOffId, using the alias name ProjOffId.
     * @return the value of ProjOffId
     */
    public Number getProjOffId() {
        return (Number) getAttributeInternal(PROJOFFID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjOffId.
     * @param value value to set the ProjOffId
     */
    public void setProjOffId(Number value) {
        setAttributeInternal(PROJOFFID, value);
    }

    /**
     * Gets the attribute value for ProjId, using the alias name ProjId.
     * @return the value of ProjId
     */
    public Number getProjId() {
        return (Number) getAttributeInternal(PROJID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjId.
     * @param value value to set the ProjId
     */
    public void setProjId(Number value) {
        setAttributeInternal(PROJID, value);
    }

    /**
     * Gets the attribute value for Name, using the alias name Name.
     * @return the value of Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Name.
     * @param value value to set the Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for ContactPer, using the alias name ContactPer.
     * @return the value of ContactPer
     */
    public String getContactPer() {
        return (String) getAttributeInternal(CONTACTPER);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactPer.
     * @param value value to set the ContactPer
     */
    public void setContactPer(String value) {
        setAttributeInternal(CONTACTPER, value);
    }

    /**
     * Gets the attribute value for Address, using the alias name Address.
     * @return the value of Address
     */
    public String getAddress() {
        return (String) getAttributeInternal(ADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Address.
     * @param value value to set the Address
     */
    public void setAddress(String value) {
        setAttributeInternal(ADDRESS, value);
    }

    /**
     * Gets the attribute value for Tel, using the alias name Tel.
     * @return the value of Tel
     */
    public String getTel() {
        return (String) getAttributeInternal(TEL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Tel.
     * @param value value to set the Tel
     */
    public void setTel(String value) {
        setAttributeInternal(TEL, value);
    }

    /**
     * Gets the attribute value for Fax, using the alias name Fax.
     * @return the value of Fax
     */
    public String getFax() {
        return (String) getAttributeInternal(FAX);
    }

    /**
     * Sets <code>value</code> as the attribute value for Fax.
     * @param value value to set the Fax
     */
    public void setFax(String value) {
        setAttributeInternal(FAX, value);
    }

    /**
     * Gets the attribute value for Email, using the alias name Email.
     * @return the value of Email
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Email.
     * @param value value to set the Email
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for Category, using the alias name Category.
     * @return the value of Category
     */
    public String getCategory() {
        return (String) getAttributeInternal(CATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Category.
     * @param value value to set the Category
     */
    public void setCategory(String value) {
        setAttributeInternal(CATEGORY, value);
    }

    /**
     * Gets the attribute value for Ast, using the alias name Ast.
     * @return the value of Ast
     */
    public String getAst() {
        return (String) getAttributeInternal(AST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ast.
     * @param value value to set the Ast
     */
    public void setAst(String value) {
        setAttributeInternal(AST, value);
    }

    /**
     * Gets the attribute value for Designation, using the alias name Designation.
     * @return the value of Designation
     */
    public String getDesignation() {
        return (String) getAttributeInternal(DESIGNATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Designation.
     * @param value value to set the Designation
     */
    public void setDesignation(String value) {
        setAttributeInternal(DESIGNATION, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public Number getUpdatedBy() {
        return (Number) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(Number value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * @return the associated entity TblProjImpl.
     */
    public TblProjImpl getTblProj() {
        return (TblProjImpl) getAttributeInternal(TBLPROJ);
    }

    /**
     * Sets <code>value</code> as the associated entity TblProjImpl.
     */
    public void setTblProj(TblProjImpl value) {
        setAttributeInternal(TBLPROJ, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblTargetCrops() {
        return (RowIterator) getAttributeInternal(TBLTARGETCROPS);
    }

    /**
     * @param projOffId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number projOffId) {
        return new Key(new Object[] { projOffId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblProjOff");
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Number loginId = null;
        try {
            loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessRID"));
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
        if (operation == DML_INSERT) {
            setCreatedBy(loginId);
            setUpdatedBy(loginId);
            } else if(operation == DML_UPDATE) {
            setUpdatedBy(loginId);
        }
        super.doDML(operation, e);
    }
}

