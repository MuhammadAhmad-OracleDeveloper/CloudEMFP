package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 31 12:10:20 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblSupplierRateMasterImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        SupplierRateMasterId,
        SupplierId,
        Dated,
        Status,
        Remarks,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblSupplierRateDetail,
        TblSupplier;
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
    public static final int SUPPLIERRATEMASTERID = AttributesEnum.SupplierRateMasterId.index();
    public static final int SUPPLIERID = AttributesEnum.SupplierId.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLSUPPLIERRATEDETAIL = AttributesEnum.TblSupplierRateDetail.index();
    public static final int TBLSUPPLIER = AttributesEnum.TblSupplier.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblSupplierRateMasterImpl() {
    }

    /**
     * Gets the attribute value for SupplierRateMasterId, using the alias name SupplierRateMasterId.
     * @return the value of SupplierRateMasterId
     */
    public BigDecimal getSupplierRateMasterId() {
        return (BigDecimal) getAttributeInternal(SUPPLIERRATEMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupplierRateMasterId.
     * @param value value to set the SupplierRateMasterId
     */
    public void setSupplierRateMasterId(BigDecimal value) {
        setAttributeInternal(SUPPLIERRATEMASTERID, value);
    }

    /**
     * Gets the attribute value for SupplierId, using the alias name SupplierId.
     * @return the value of SupplierId
     */
    public BigDecimal getSupplierId() {
        return (BigDecimal) getAttributeInternal(SUPPLIERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupplierId.
     * @param value value to set the SupplierId
     */
    public void setSupplierId(BigDecimal value) {
        setAttributeInternal(SUPPLIERID, value);
    }

    /**
     * Gets the attribute value for Dated, using the alias name Dated.
     * @return the value of Dated
     */
    public Timestamp getDated() {
        return (Timestamp) getAttributeInternal(DATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dated.
     * @param value value to set the Dated
     */
    public void setDated(Timestamp value) {
        setAttributeInternal(DATED, value);
    }

    /**
     * Gets the attribute value for Status, using the alias name Status.
     * @return the value of Status
     */
    public BigDecimal getStatus() {
        return (BigDecimal) getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Status.
     * @param value value to set the Status
     */
    public void setStatus(BigDecimal value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public BigDecimal getCreatedBy() {
        return (BigDecimal) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(BigDecimal value) {
        setAttributeInternal(CREATEDBY, value);
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
    public BigDecimal getUpdatedBy() {
        return (BigDecimal) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(BigDecimal value) {
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblSupplierRateDetail() {
        return (RowIterator) getAttributeInternal(TBLSUPPLIERRATEDETAIL);
    }

    /**
     * @return the associated entity TblSupplierImpl.
     */
    public TblSupplierImpl getTblSupplier() {
        return (TblSupplierImpl) getAttributeInternal(TBLSUPPLIER);
    }

    /**
     * Sets <code>value</code> as the associated entity TblSupplierImpl.
     */
    public void setTblSupplier(TblSupplierImpl value) {
        setAttributeInternal(TBLSUPPLIER, value);
    }

    /**
     * @param supplierRateMasterId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal supplierRateMasterId) {
        return new Key(new Object[] { supplierRateMasterId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblSupplierRateMaster");
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
        BigDecimal loginId = null;
         try {
             loginId = new BigDecimal((String) ADFContext.getCurrent().getSessionScope().get("sessUID"));
         } catch(Exception ex) {
             ex.printStackTrace();
         }
         
         if (operation == DML_INSERT) {
             setCreatedBy(loginId);
             setUpdatedBy(loginId);
         } else {
             setUpdatedBy(loginId);
         }
        super.doDML(operation, e);
    }
}
