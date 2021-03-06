package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Nov 30 11:08:53 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblB2bMeetingImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        B2bMeetingId,
        B2bMeetingType,
        ExhibitorsId,
        ExpoSchId,
        Name,
        IntlDelegAppMId,
        Remarks,
        Linkages,
        ExpDeal,
        ExpDealAmt,
        FinalDeal,
        FinalDealAmt,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        FocalPerson,
        ExpoStallId,
        TblExhibitors,
        TblIntlDelegAppM,
        TblB2bMeetingCom;
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


    public static final int B2BMEETINGID = AttributesEnum.B2bMeetingId.index();
    public static final int B2BMEETINGTYPE = AttributesEnum.B2bMeetingType.index();
    public static final int EXHIBITORSID = AttributesEnum.ExhibitorsId.index();
    public static final int EXPOSCHID = AttributesEnum.ExpoSchId.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int INTLDELEGAPPMID = AttributesEnum.IntlDelegAppMId.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int LINKAGES = AttributesEnum.Linkages.index();
    public static final int EXPDEAL = AttributesEnum.ExpDeal.index();
    public static final int EXPDEALAMT = AttributesEnum.ExpDealAmt.index();
    public static final int FINALDEAL = AttributesEnum.FinalDeal.index();
    public static final int FINALDEALAMT = AttributesEnum.FinalDealAmt.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int FOCALPERSON = AttributesEnum.FocalPerson.index();
    public static final int EXPOSTALLID = AttributesEnum.ExpoStallId.index();
    public static final int TBLEXHIBITORS = AttributesEnum.TblExhibitors.index();
    public static final int TBLINTLDELEGAPPM = AttributesEnum.TblIntlDelegAppM.index();
    public static final int TBLB2BMEETINGCOM = AttributesEnum.TblB2bMeetingCom.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblB2bMeetingImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblB2bMeeting");
    }


    /**
     * Gets the attribute value for B2bMeetingId, using the alias name B2bMeetingId.
     * @return the value of B2bMeetingId
     */
    public Number getB2bMeetingId() {
        return (Number) getAttributeInternal(B2BMEETINGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for B2bMeetingId.
     * @param value value to set the B2bMeetingId
     */
    public void setB2bMeetingId(Number value) {
        setAttributeInternal(B2BMEETINGID, value);
    }

    /**
     * Gets the attribute value for B2bMeetingType, using the alias name B2bMeetingType.
     * @return the value of B2bMeetingType
     */
    public String getB2bMeetingType() {
        return (String) getAttributeInternal(B2BMEETINGTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for B2bMeetingType.
     * @param value value to set the B2bMeetingType
     */
    public void setB2bMeetingType(String value) {
        setAttributeInternal(B2BMEETINGTYPE, value);
    }

    /**
     * Gets the attribute value for ExhibitorsId, using the alias name ExhibitorsId.
     * @return the value of ExhibitorsId
     */
    public Number getExhibitorsId() {
        return (Number) getAttributeInternal(EXHIBITORSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExhibitorsId.
     * @param value value to set the ExhibitorsId
     */
    public void setExhibitorsId(Number value) {
        setAttributeInternal(EXHIBITORSID, value);
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
     * Gets the attribute value for IntlDelegAppMId, using the alias name IntlDelegAppMId.
     * @return the value of IntlDelegAppMId
     */
    public Number getIntlDelegAppMId() {
        return (Number) getAttributeInternal(INTLDELEGAPPMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for IntlDelegAppMId.
     * @param value value to set the IntlDelegAppMId
     */
    public void setIntlDelegAppMId(Number value) {
        setAttributeInternal(INTLDELEGAPPMID, value);
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
     * Gets the attribute value for Linkages, using the alias name Linkages.
     * @return the value of Linkages
     */
    public Number getLinkages() {
        return (Number) getAttributeInternal(LINKAGES);
    }

    /**
     * Sets <code>value</code> as the attribute value for Linkages.
     * @param value value to set the Linkages
     */
    public void setLinkages(Number value) {
        setAttributeInternal(LINKAGES, value);
    }

    /**
     * Gets the attribute value for ExpDeal, using the alias name ExpDeal.
     * @return the value of ExpDeal
     */
    public Number getExpDeal() {
        return (Number) getAttributeInternal(EXPDEAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpDeal.
     * @param value value to set the ExpDeal
     */
    public void setExpDeal(Number value) {
        setAttributeInternal(EXPDEAL, value);
    }

    /**
     * Gets the attribute value for ExpDealAmt, using the alias name ExpDealAmt.
     * @return the value of ExpDealAmt
     */
    public Number getExpDealAmt() {
        return (Number) getAttributeInternal(EXPDEALAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpDealAmt.
     * @param value value to set the ExpDealAmt
     */
    public void setExpDealAmt(Number value) {
        setAttributeInternal(EXPDEALAMT, value);
    }

    /**
     * Gets the attribute value for FinalDeal, using the alias name FinalDeal.
     * @return the value of FinalDeal
     */
    public Number getFinalDeal() {
        return (Number) getAttributeInternal(FINALDEAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for FinalDeal.
     * @param value value to set the FinalDeal
     */
    public void setFinalDeal(Number value) {
        setAttributeInternal(FINALDEAL, value);
    }

    /**
     * Gets the attribute value for FinalDealAmt, using the alias name FinalDealAmt.
     * @return the value of FinalDealAmt
     */
    public Number getFinalDealAmt() {
        return (Number) getAttributeInternal(FINALDEALAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FinalDealAmt.
     * @param value value to set the FinalDealAmt
     */
    public void setFinalDealAmt(Number value) {
        setAttributeInternal(FINALDEALAMT, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public oracle.jbo.domain.Number getCreatedBy() {
        return (oracle.jbo.domain.Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(oracle.jbo.domain.Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
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
     * Gets the attribute value for FocalPerson, using the alias name FocalPerson.
     * @return the value of FocalPerson
     */
    public String getFocalPerson() {
        return (String) getAttributeInternal(FOCALPERSON);
    }

    /**
     * Sets <code>value</code> as the attribute value for FocalPerson.
     * @param value value to set the FocalPerson
     */
    public void setFocalPerson(String value) {
        setAttributeInternal(FOCALPERSON, value);
    }

    /**
     * Gets the attribute value for ExpoStallId, using the alias name ExpoStallId.
     * @return the value of ExpoStallId
     */
    public BigDecimal getExpoStallId() {
        return (BigDecimal) getAttributeInternal(EXPOSTALLID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpoStallId.
     * @param value value to set the ExpoStallId
     */
    public void setExpoStallId(BigDecimal value) {
        setAttributeInternal(EXPOSTALLID, value);
    }

    /**
     * Gets the attribute value for ExpoSchId, using the alias name ExpoSchId.
     * @return the value of ExpoSchId
     */
    public Number getExpoSchId() {
        return (Number) getAttributeInternal(EXPOSCHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpoSchId.
     * @param value value to set the ExpoSchId
     */
    public void setExpoSchId(Number value) {
        setAttributeInternal(EXPOSCHID, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblExhibitorsImpl getTblExhibitors() {
        return (TblExhibitorsImpl) getAttributeInternal(TBLEXHIBITORS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblExhibitors(TblExhibitorsImpl value) {
        setAttributeInternal(TBLEXHIBITORS, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblIntlDelegAppMImpl getTblIntlDelegAppM() {
        return (TblIntlDelegAppMImpl) getAttributeInternal(TBLINTLDELEGAPPM);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblIntlDelegAppM(TblIntlDelegAppMImpl value) {
        setAttributeInternal(TBLINTLDELEGAPPM, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblB2bMeetingCom() {
        return (RowIterator) getAttributeInternal(TBLB2BMEETINGCOM);
    }


    /**
     * @param b2bMeetingId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number b2bMeetingId) {
        return new Key(new Object[] { b2bMeetingId });
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
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (operation == DML_INSERT) {
            setCreatedBy(loginId);
            setUpdatedBy(loginId);
        } else if (operation == DML_UPDATE) {
            setUpdatedBy(loginId);
        }
        super.doDML(operation, e);
    }
}

