package model.EO;

import oracle.jbo.domain.Number;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 31 12:42:11 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblFarmerRegCertImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FarmerRegCertId,
        FarmerRegId,
        CertificationId,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblCertification,
        TblFarmerReg,
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


    public static final int FARMERREGCERTID = AttributesEnum.FarmerRegCertId.index();
    public static final int FARMERREGID = AttributesEnum.FarmerRegId.index();
    public static final int CERTIFICATIONID = AttributesEnum.CertificationId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLCERTIFICATION = AttributesEnum.TblCertification.index();
    public static final int TBLFARMERREG = AttributesEnum.TblFarmerReg.index();
    public static final int MAP_FARMER_DETAIL = AttributesEnum.Map_Farmer_Detail.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblFarmerRegCertImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblFarmerRegCert");
    }


    /**
     * Gets the attribute value for FarmerRegCertId, using the alias name FarmerRegCertId.
     * @return the value of FarmerRegCertId
     */
    public Number getFarmerRegCertId() {
        return (Number) getAttributeInternal(FARMERREGCERTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FarmerRegCertId.
     * @param value value to set the FarmerRegCertId
     */
    public void setFarmerRegCertId(Number value) {
        setAttributeInternal(FARMERREGCERTID, value);
    }

    /**
     * Gets the attribute value for FarmerRegId, using the alias name FarmerRegId.
     * @return the value of FarmerRegId
     */
    public Number getFarmerRegId() {
        return (Number) getAttributeInternal(FARMERREGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FarmerRegId.
     * @param value value to set the FarmerRegId
     */
    public void setFarmerRegId(Number value) {
        setAttributeInternal(FARMERREGID, value);
    }

    /**
     * Gets the attribute value for CertificationId, using the alias name CertificationId.
     * @return the value of CertificationId
     */
    public Number getCertificationId() {
        return (Number) getAttributeInternal(CERTIFICATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CertificationId.
     * @param value value to set the CertificationId
     */
    public void setCertificationId(Number value) {
        setAttributeInternal(CERTIFICATIONID, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblCertification() {
        return (EntityImpl) getAttributeInternal(TBLCERTIFICATION);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblCertification(EntityImpl value) {
        setAttributeInternal(TBLCERTIFICATION, value);
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
     * @param farmerRegCertId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number farmerRegCertId) {
        return new Key(new Object[] { farmerRegCertId });
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

