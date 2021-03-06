package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Nov 30 12:30:41 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblExpoIntlDelegImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ExpoIntlDelegId,
        ExpoSetupId,
        TotalDeleg,
        LibrCountryId,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        FDeleg,
        DayRate,
        Nod,
        TicketAmount,
        TotalCost,
        TblExpoSetup;
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


    public static final int EXPOINTLDELEGID = AttributesEnum.ExpoIntlDelegId.index();
    public static final int EXPOSETUPID = AttributesEnum.ExpoSetupId.index();
    public static final int TOTALDELEG = AttributesEnum.TotalDeleg.index();
    public static final int LIBRCOUNTRYID = AttributesEnum.LibrCountryId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int FDELEG = AttributesEnum.FDeleg.index();
    public static final int DAYRATE = AttributesEnum.DayRate.index();
    public static final int NOD = AttributesEnum.Nod.index();
    public static final int TICKETAMOUNT = AttributesEnum.TicketAmount.index();
    public static final int TOTALCOST = AttributesEnum.TotalCost.index();
    public static final int TBLEXPOSETUP = AttributesEnum.TblExpoSetup.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblExpoIntlDelegImpl() {
    }

    /**
     * Gets the attribute value for ExpoIntlDelegId, using the alias name ExpoIntlDelegId.
     * @return the value of ExpoIntlDelegId
     */
    public Number getExpoIntlDelegId() {
        return (Number) getAttributeInternal(EXPOINTLDELEGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpoIntlDelegId.
     * @param value value to set the ExpoIntlDelegId
     */
    public void setExpoIntlDelegId(Number value) {
        setAttributeInternal(EXPOINTLDELEGID, value);
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblExpoIntlDeleg");
    }


    /**
     * Gets the attribute value for ExpoSetupId, using the alias name ExpoSetupId.
     * @return the value of ExpoSetupId
     */
    public Number getExpoSetupId() {
        return (Number) getAttributeInternal(EXPOSETUPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpoSetupId.
     * @param value value to set the ExpoSetupId
     */
    public void setExpoSetupId(Number value) {
        setAttributeInternal(EXPOSETUPID, value);
    }

    /**
     * Gets the attribute value for TotalDeleg, using the alias name TotalDeleg.
     * @return the value of TotalDeleg
     */
    public Number getTotalDeleg() {
        return (Number) getAttributeInternal(TOTALDELEG);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalDeleg.
     * @param value value to set the TotalDeleg
     */
    public void setTotalDeleg(Number value) {
        setAttributeInternal(TOTALDELEG, value);
    }

    /**
     * Gets the attribute value for LibrCountryId, using the alias name LibrCountryId.
     * @return the value of LibrCountryId
     */
    public Number getLibrCountryId() {
        return (Number) getAttributeInternal(LIBRCOUNTRYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LibrCountryId.
     * @param value value to set the LibrCountryId
     */
    public void setLibrCountryId(Number value) {
        setAttributeInternal(LIBRCOUNTRYID, value);
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
     * Gets the attribute value for FDeleg, using the alias name FDeleg.
     * @return the value of FDeleg
     */
    public Number getFDeleg() {
        return (Number) getAttributeInternal(FDELEG);
    }

    /**
     * Sets <code>value</code> as the attribute value for FDeleg.
     * @param value value to set the FDeleg
     */
    public void setFDeleg(Number value) {
        setAttributeInternal(FDELEG, value);
    }

    /**
     * Gets the attribute value for DayRate, using the alias name DayRate.
     * @return the value of DayRate
     */
    public BigDecimal getDayRate() {
        return (BigDecimal) getAttributeInternal(DAYRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DayRate.
     * @param value value to set the DayRate
     */
    public void setDayRate(BigDecimal value) {
        setAttributeInternal(DAYRATE, value);
    }


    /**
     * Gets the attribute value for Nod, using the alias name Nod.
     * @return the value of Nod
     */
    public BigDecimal getNod() {
        return (BigDecimal) getAttributeInternal(NOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nod.
     * @param value value to set the Nod
     */
    public void setNod(BigDecimal value) {
        setAttributeInternal(NOD, value);
    }


    /**
     * Gets the attribute value for TicketAmount, using the alias name TicketAmount.
     * @return the value of TicketAmount
     */
    public BigDecimal getTicketAmount() {
        return (BigDecimal) getAttributeInternal(TICKETAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TicketAmount.
     * @param value value to set the TicketAmount
     */
    public void setTicketAmount(BigDecimal value) {
        setAttributeInternal(TICKETAMOUNT, value);
    }

    /**
     * Gets the attribute value for TotalCost, using the alias name TotalCost.
     * @return the value of TotalCost
     */
    public BigDecimal getTotalCost() {
        return (BigDecimal) getAttributeInternal(TOTALCOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalCost.
     * @param value value to set the TotalCost
     */
    public void setTotalCost(BigDecimal value) {
        setAttributeInternal(TOTALCOST, value);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblExpoSetupImpl getTblExpoSetup() {
        return (TblExpoSetupImpl) getAttributeInternal(TBLEXPOSETUP);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblExpoSetup(TblExpoSetupImpl value) {
        setAttributeInternal(TBLEXPOSETUP, value);
    }


    /**
     * @param expoIntlDelegId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number expoIntlDelegId) {
        return new Key(new Object[] { expoIntlDelegId });
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

