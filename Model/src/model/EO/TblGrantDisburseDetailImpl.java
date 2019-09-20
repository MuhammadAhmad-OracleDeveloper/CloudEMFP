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
// ---    Sat Jul 27 16:46:54 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblGrantDisburseDetailImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        GrantDisburseDetailId,
        GrantDisburseMasterId,
        FarmerRegId,
        Acre,
        Rate,
        Amount,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        FAmount,
        GrantBase,
        TblFarmerReg,
        TblGrantDisburseMaster,
        Map_Farmer_Detail;
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


    public static final int GRANTDISBURSEDETAILID = AttributesEnum.GrantDisburseDetailId.index();
    public static final int GRANTDISBURSEMASTERID = AttributesEnum.GrantDisburseMasterId.index();
    public static final int FARMERREGID = AttributesEnum.FarmerRegId.index();
    public static final int ACRE = AttributesEnum.Acre.index();
    public static final int RATE = AttributesEnum.Rate.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int FAMOUNT = AttributesEnum.FAmount.index();
    public static final int GRANTBASE = AttributesEnum.GrantBase.index();
    public static final int TBLFARMERREG = AttributesEnum.TblFarmerReg.index();
    public static final int TBLGRANTDISBURSEMASTER = AttributesEnum.TblGrantDisburseMaster.index();
    public static final int MAP_FARMER_DETAIL = AttributesEnum.Map_Farmer_Detail.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblGrantDisburseDetailImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblGrantDisburseDetail");
    }


    /**
     * Gets the attribute value for GrantDisburseDetailId, using the alias name GrantDisburseDetailId.
     * @return the value of GrantDisburseDetailId
     */
    public BigDecimal getGrantDisburseDetailId() {
        return (BigDecimal) getAttributeInternal(GRANTDISBURSEDETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrantDisburseDetailId.
     * @param value value to set the GrantDisburseDetailId
     */
    public void setGrantDisburseDetailId(BigDecimal value) {
        setAttributeInternal(GRANTDISBURSEDETAILID, value);
    }

    /**
     * Gets the attribute value for GrantDisburseMasterId, using the alias name GrantDisburseMasterId.
     * @return the value of GrantDisburseMasterId
     */
    public BigDecimal getGrantDisburseMasterId() {
        return (BigDecimal) getAttributeInternal(GRANTDISBURSEMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrantDisburseMasterId.
     * @param value value to set the GrantDisburseMasterId
     */
    public void setGrantDisburseMasterId(BigDecimal value) {
        setAttributeInternal(GRANTDISBURSEMASTERID, value);
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
     * Gets the attribute value for Acre, using the alias name Acre.
     * @return the value of Acre
     */
    public BigDecimal getAcre() {
        return (BigDecimal) getAttributeInternal(ACRE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Acre.
     * @param value value to set the Acre
     */
    public void setAcre(BigDecimal value) {
        setAttributeInternal(ACRE, value);
    }

    /**
     * Gets the attribute value for Rate, using the alias name Rate.
     * @return the value of Rate
     */
    public BigDecimal getRate() {
        return (BigDecimal) getAttributeInternal(RATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rate.
     * @param value value to set the Rate
     */
    public void setRate(BigDecimal value) {
        setAttributeInternal(RATE, value);
    }

    /**
     * Gets the attribute value for Amount, using the alias name Amount.
     * @return the value of Amount
     */
    public BigDecimal getAmount() {
        return (BigDecimal) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Amount.
     * @param value value to set the Amount
     */
    public void setAmount(BigDecimal value) {
        setAttributeInternal(AMOUNT, value);
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
     * Gets the attribute value for FAmount, using the alias name FAmount.
     * @return the value of FAmount
     */
    public BigDecimal getFAmount() {
        return (BigDecimal) getAttributeInternal(FAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FAmount.
     * @param value value to set the FAmount
     */
    public void setFAmount(BigDecimal value) {
        setAttributeInternal(FAMOUNT, value);
    }

    /**
     * Gets the attribute value for GrantBase, using the alias name GrantBase.
     * @return the value of GrantBase
     */
    public String getGrantBase() {
        return (String) getAttributeInternal(GRANTBASE);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrantBase.
     * @param value value to set the GrantBase
     */
    public void setGrantBase(String value) {
        setAttributeInternal(GRANTBASE, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblFarmerRegImpl getTblFarmerReg() {
        return (TblFarmerRegImpl) getAttributeInternal(TBLFARMERREG);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblFarmerReg(TblFarmerRegImpl value) {
        setAttributeInternal(TBLFARMERREG, value);
    }

    /**
     * @return the associated entity TblGrantDisburseMasterImpl.
     */
    public TblGrantDisburseMasterImpl getTblGrantDisburseMaster() {
        return (TblGrantDisburseMasterImpl) getAttributeInternal(TBLGRANTDISBURSEMASTER);
    }

    /**
     * Sets <code>value</code> as the associated entity TblGrantDisburseMasterImpl.
     */
    public void setTblGrantDisburseMaster(TblGrantDisburseMasterImpl value) {
        setAttributeInternal(TBLGRANTDISBURSEMASTER, value);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getMap_Farmer_Detail() {
        return (EntityImpl) getAttributeInternal(MAP_FARMER_DETAIL);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setMap_Farmer_Detail(EntityImpl value) {
        setAttributeInternal(MAP_FARMER_DETAIL, value);
    }


    /**
     * @param grantDisburseDetailId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal grantDisburseDetailId) {
        return new Key(new Object[] { grantDisburseDetailId });
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

