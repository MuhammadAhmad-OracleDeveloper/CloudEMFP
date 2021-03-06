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
// ---    Wed Jul 31 12:44:09 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblFarmerRegLandImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FarmerRegLandId,
        FarmerRegId,
        LandAcre,
        LandKanal,
        PresentProd,
        LandUnderOrch,
        SelfshipType,
        SelfLocalMark,
        SelfExportMark,
        ContractMark,
        KhatooniNo,
        KhauuetNo,
        QittaNo,
        KhasraNo,
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


    public static final int FARMERREGLANDID = AttributesEnum.FarmerRegLandId.index();
    public static final int FARMERREGID = AttributesEnum.FarmerRegId.index();
    public static final int LANDACRE = AttributesEnum.LandAcre.index();
    public static final int LANDKANAL = AttributesEnum.LandKanal.index();
    public static final int PRESENTPROD = AttributesEnum.PresentProd.index();
    public static final int LANDUNDERORCH = AttributesEnum.LandUnderOrch.index();
    public static final int SELFSHIPTYPE = AttributesEnum.SelfshipType.index();
    public static final int SELFLOCALMARK = AttributesEnum.SelfLocalMark.index();
    public static final int SELFEXPORTMARK = AttributesEnum.SelfExportMark.index();
    public static final int CONTRACTMARK = AttributesEnum.ContractMark.index();
    public static final int KHATOONINO = AttributesEnum.KhatooniNo.index();
    public static final int KHAUUETNO = AttributesEnum.KhauuetNo.index();
    public static final int QITTANO = AttributesEnum.QittaNo.index();
    public static final int KHASRANO = AttributesEnum.KhasraNo.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLFARMERREG = AttributesEnum.TblFarmerReg.index();
    public static final int MAP_FARMER_DETAIL = AttributesEnum.Map_Farmer_Detail.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblFarmerRegLandImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblFarmerRegLand");
    }


    /**
     * Gets the attribute value for FarmerRegLandId, using the alias name FarmerRegLandId.
     * @return the value of FarmerRegLandId
     */
    public Number getFarmerRegLandId() {
        return (Number) getAttributeInternal(FARMERREGLANDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FarmerRegLandId.
     * @param value value to set the FarmerRegLandId
     */
    public void setFarmerRegLandId(Number value) {
        setAttributeInternal(FARMERREGLANDID, value);
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
     * Gets the attribute value for LandKanal, using the alias name LandKanal.
     * @return the value of LandKanal
     */
    public Number getLandKanal() {
        return (Number) getAttributeInternal(LANDKANAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for LandKanal.
     * @param value value to set the LandKanal
     */
    public void setLandKanal(Number value) {
        setAttributeInternal(LANDKANAL, value);
    }

    /**
     * Gets the attribute value for PresentProd, using the alias name PresentProd.
     * @return the value of PresentProd
     */
    public Number getPresentProd() {
        return (Number) getAttributeInternal(PRESENTPROD);
    }

    /**
     * Sets <code>value</code> as the attribute value for PresentProd.
     * @param value value to set the PresentProd
     */
    public void setPresentProd(Number value) {
        setAttributeInternal(PRESENTPROD, value);
    }

    /**
     * Gets the attribute value for LandUnderOrch, using the alias name LandUnderOrch.
     * @return the value of LandUnderOrch
     */
    public Number getLandUnderOrch() {
        return (Number) getAttributeInternal(LANDUNDERORCH);
    }

    /**
     * Sets <code>value</code> as the attribute value for LandUnderOrch.
     * @param value value to set the LandUnderOrch
     */
    public void setLandUnderOrch(Number value) {
        setAttributeInternal(LANDUNDERORCH, value);
    }

    /**
     * Gets the attribute value for SelfshipType, using the alias name SelfshipType.
     * @return the value of SelfshipType
     */
    public String getSelfshipType() {
        return (String) getAttributeInternal(SELFSHIPTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SelfshipType.
     * @param value value to set the SelfshipType
     */
    public void setSelfshipType(String value) {
        setAttributeInternal(SELFSHIPTYPE, value);
    }

    /**
     * Gets the attribute value for SelfLocalMark, using the alias name SelfLocalMark.
     * @return the value of SelfLocalMark
     */
    public String getSelfLocalMark() {
        return (String) getAttributeInternal(SELFLOCALMARK);
    }

    /**
     * Sets <code>value</code> as the attribute value for SelfLocalMark.
     * @param value value to set the SelfLocalMark
     */
    public void setSelfLocalMark(String value) {
        setAttributeInternal(SELFLOCALMARK, value);
    }

    /**
     * Gets the attribute value for SelfExportMark, using the alias name SelfExportMark.
     * @return the value of SelfExportMark
     */
    public String getSelfExportMark() {
        return (String) getAttributeInternal(SELFEXPORTMARK);
    }

    /**
     * Sets <code>value</code> as the attribute value for SelfExportMark.
     * @param value value to set the SelfExportMark
     */
    public void setSelfExportMark(String value) {
        setAttributeInternal(SELFEXPORTMARK, value);
    }

    /**
     * Gets the attribute value for ContractMark, using the alias name ContractMark.
     * @return the value of ContractMark
     */
    public String getContractMark() {
        return (String) getAttributeInternal(CONTRACTMARK);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContractMark.
     * @param value value to set the ContractMark
     */
    public void setContractMark(String value) {
        setAttributeInternal(CONTRACTMARK, value);
    }

    /**
     * Gets the attribute value for KhatooniNo, using the alias name KhatooniNo.
     * @return the value of KhatooniNo
     */
    public Number getKhatooniNo() {
        return (Number) getAttributeInternal(KHATOONINO);
    }

    /**
     * Sets <code>value</code> as the attribute value for KhatooniNo.
     * @param value value to set the KhatooniNo
     */
    public void setKhatooniNo(Number value) {
        setAttributeInternal(KHATOONINO, value);
    }

    /**
     * Gets the attribute value for KhauuetNo, using the alias name KhauuetNo.
     * @return the value of KhauuetNo
     */
    public Number getKhauuetNo() {
        return (Number) getAttributeInternal(KHAUUETNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for KhauuetNo.
     * @param value value to set the KhauuetNo
     */
    public void setKhauuetNo(Number value) {
        setAttributeInternal(KHAUUETNO, value);
    }

    /**
     * Gets the attribute value for QittaNo, using the alias name QittaNo.
     * @return the value of QittaNo
     */
    public Number getQittaNo() {
        return (Number) getAttributeInternal(QITTANO);
    }

    /**
     * Sets <code>value</code> as the attribute value for QittaNo.
     * @param value value to set the QittaNo
     */
    public void setQittaNo(Number value) {
        setAttributeInternal(QITTANO, value);
    }

    /**
     * Gets the attribute value for KhasraNo, using the alias name KhasraNo.
     * @return the value of KhasraNo
     */
    public Number getKhasraNo() {
        return (Number) getAttributeInternal(KHASRANO);
    }

    /**
     * Sets <code>value</code> as the attribute value for KhasraNo.
     * @param value value to set the KhasraNo
     */
    public void setKhasraNo(Number value) {
        setAttributeInternal(KHASRANO, value);
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
     * @param farmerRegLandId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number farmerRegLandId) {
        return new Key(new Object[] { farmerRegLandId });
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

