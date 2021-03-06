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
// ---    Wed Jul 31 12:47:18 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblFarmerRegOwnershipImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FarmerRegOwnershipId,
        FarmerRegId,
        OwnerName,
        Cnic,
        LandAcre,
        Relationship,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
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


    public static final int FARMERREGOWNERSHIPID = AttributesEnum.FarmerRegOwnershipId.index();
    public static final int FARMERREGID = AttributesEnum.FarmerRegId.index();
    public static final int OWNERNAME = AttributesEnum.OwnerName.index();
    public static final int CNIC = AttributesEnum.Cnic.index();
    public static final int LANDACRE = AttributesEnum.LandAcre.index();
    public static final int RELATIONSHIP = AttributesEnum.Relationship.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLFARMERREG = AttributesEnum.TblFarmerReg.index();
    public static final int MAP_FARMER_DETAIL = AttributesEnum.Map_Farmer_Detail.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblFarmerRegOwnershipImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblFarmerRegOwnership");
    }


    /**
     * Gets the attribute value for FarmerRegOwnershipId, using the alias name FarmerRegOwnershipId.
     * @return the value of FarmerRegOwnershipId
     */
    public Number getFarmerRegOwnershipId() {
        return (Number) getAttributeInternal(FARMERREGOWNERSHIPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FarmerRegOwnershipId.
     * @param value value to set the FarmerRegOwnershipId
     */
    public void setFarmerRegOwnershipId(Number value) {
        setAttributeInternal(FARMERREGOWNERSHIPID, value);
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
     * Gets the attribute value for OwnerName, using the alias name OwnerName.
     * @return the value of OwnerName
     */
    public String getOwnerName() {
        return (String) getAttributeInternal(OWNERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for OwnerName.
     * @param value value to set the OwnerName
     */
    public void setOwnerName(String value) {
        setAttributeInternal(OWNERNAME, value);
    }

    /**
     * Gets the attribute value for Cnic, using the alias name Cnic.
     * @return the value of Cnic
     */
    public String getCnic() {
        return (String) getAttributeInternal(CNIC);
    }

    /**
     * Sets <code>value</code> as the attribute value for Cnic.
     * @param value value to set the Cnic
     */
    public void setCnic(String value) {
        setAttributeInternal(CNIC, value);
    }

    /**
     * Gets the attribute value for LandAcre, using the alias name LandAcre.
     * @return the value of LandAcre
     */
    public Number getLandAcre() {
        return (Number) getAttributeInternal(LANDACRE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LandAcre.
     * @param value value to set the LandAcre
     */
    public void setLandAcre(Number value) {
        setAttributeInternal(LANDACRE, value);
    }

    /**
     * Gets the attribute value for Relationship, using the alias name Relationship.
     * @return the value of Relationship
     */
    public String getRelationship() {
        return (String) getAttributeInternal(RELATIONSHIP);
    }

    /**
     * Sets <code>value</code> as the attribute value for Relationship.
     * @param value value to set the Relationship
     */
    public void setRelationship(String value) {
        setAttributeInternal(RELATIONSHIP, value);
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
     * @param farmerRegOwnershipId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number farmerRegOwnershipId) {
        return new Key(new Object[] { farmerRegOwnershipId });
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

