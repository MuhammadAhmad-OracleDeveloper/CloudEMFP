package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 31 12:35:15 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblGrantAppDetailImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        GrantAppDetailId,
        GrantAppMasterId,
        SupplierId,
        ItemL4Id,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        FarmerRegId,
        GrantInterest,
        GrantStatus,
        TblGrantAppMaster,
        TblItemL4,
        TblSupplier,
        TblFarmerReg;
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


    public static final int GRANTAPPDETAILID = AttributesEnum.GrantAppDetailId.index();
    public static final int GRANTAPPMASTERID = AttributesEnum.GrantAppMasterId.index();
    public static final int SUPPLIERID = AttributesEnum.SupplierId.index();
    public static final int ITEML4ID = AttributesEnum.ItemL4Id.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int FARMERREGID = AttributesEnum.FarmerRegId.index();
    public static final int GRANTINTEREST = AttributesEnum.GrantInterest.index();
    public static final int GRANTSTATUS = AttributesEnum.GrantStatus.index();
    public static final int TBLGRANTAPPMASTER = AttributesEnum.TblGrantAppMaster.index();
    public static final int TBLITEML4 = AttributesEnum.TblItemL4.index();
    public static final int TBLSUPPLIER = AttributesEnum.TblSupplier.index();
    public static final int TBLFARMERREG = AttributesEnum.TblFarmerReg.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblGrantAppDetailImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblGrantAppDetail");
    }


    /**
     * Gets the attribute value for GrantAppDetailId, using the alias name GrantAppDetailId.
     * @return the value of GrantAppDetailId
     */
    public BigDecimal getGrantAppDetailId() {
        return (BigDecimal) getAttributeInternal(GRANTAPPDETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrantAppDetailId.
     * @param value value to set the GrantAppDetailId
     */
    public void setGrantAppDetailId(BigDecimal value) {
        setAttributeInternal(GRANTAPPDETAILID, value);
    }

    /**
     * Gets the attribute value for GrantAppMasterId, using the alias name GrantAppMasterId.
     * @return the value of GrantAppMasterId
     */
    public BigDecimal getGrantAppMasterId() {
        return (BigDecimal) getAttributeInternal(GRANTAPPMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrantAppMasterId.
     * @param value value to set the GrantAppMasterId
     */
    public void setGrantAppMasterId(BigDecimal value) {
        setAttributeInternal(GRANTAPPMASTERID, value);
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
     * Gets the attribute value for ItemL4Id, using the alias name ItemL4Id.
     * @return the value of ItemL4Id
     */
    public BigDecimal getItemL4Id() {
        return (BigDecimal) getAttributeInternal(ITEML4ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemL4Id.
     * @param value value to set the ItemL4Id
     */
    public void setItemL4Id(BigDecimal value) {
        setAttributeInternal(ITEML4ID, value);
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
     * Gets the attribute value for FarmerRegId, using the alias name FarmerRegId.
     * @return the value of FarmerRegId
     */
    public BigDecimal getFarmerRegId() {
        return (BigDecimal) getAttributeInternal(FARMERREGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FarmerRegId.
     * @param value value to set the FarmerRegId
     */
    public void setFarmerRegId(BigDecimal value) {
        setAttributeInternal(FARMERREGID, value);
    }

    /**
     * Gets the attribute value for GrantInterest, using the alias name GrantInterest.
     * @return the value of GrantInterest
     */
    public String getGrantInterest() {
        return (String) getAttributeInternal(GRANTINTEREST);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrantInterest.
     * @param value value to set the GrantInterest
     */
    public void setGrantInterest(String value) {
        setAttributeInternal(GRANTINTEREST, value);
    }

    /**
     * Gets the attribute value for GrantStatus, using the alias name GrantStatus.
     * @return the value of GrantStatus
     */
    public String getGrantStatus() {
        return (String) getAttributeInternal(GRANTSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrantStatus.
     * @param value value to set the GrantStatus
     */
    public void setGrantStatus(String value) {
        setAttributeInternal(GRANTSTATUS, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblGrantAppMasterImpl getTblGrantAppMaster() {
        return (TblGrantAppMasterImpl) getAttributeInternal(TBLGRANTAPPMASTER);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblGrantAppMaster(TblGrantAppMasterImpl value) {
        setAttributeInternal(TBLGRANTAPPMASTER, value);
    }

    /**
     * @return the associated entity TblItemL4Impl.
     */
    public TblItemL4Impl getTblItemL4() {
        return (TblItemL4Impl) getAttributeInternal(TBLITEML4);
    }

    /**
     * Sets <code>value</code> as the associated entity TblItemL4Impl.
     */
    public void setTblItemL4(TblItemL4Impl value) {
        setAttributeInternal(TBLITEML4, value);
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
     * @return the associated entity TblFarmerRegImpl.
     */
    public TblFarmerRegImpl getTblFarmerReg() {
        return (TblFarmerRegImpl) getAttributeInternal(TBLFARMERREG);
    }

    /**
     * Sets <code>value</code> as the associated entity TblFarmerRegImpl.
     */
    public void setTblFarmerReg(TblFarmerRegImpl value) {
        setAttributeInternal(TBLFARMERREG, value);
    }

    /**
     * @param grantAppDetailId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal grantAppDetailId) {
        return new Key(new Object[] { grantAppDetailId });
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
             } else if(operation == DML_UPDATE) {
             setUpdatedBy(loginId);
         }
        super.doDML(operation, e);
    }
}

