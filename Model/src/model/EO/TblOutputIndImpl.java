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
// ---    Sat Jul 27 16:12:13 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblOutputIndImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        OutputIndId,
        Name,
        Ast,
        PhaseId,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblMonParam,
        TblPhase;
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
    public static final int OUTPUTINDID = AttributesEnum.OutputIndId.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int PHASEID = AttributesEnum.PhaseId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLMONPARAM = AttributesEnum.TblMonParam.index();
    public static final int TBLPHASE = AttributesEnum.TblPhase.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblOutputIndImpl() {
    }

    /**
     * Gets the attribute value for OutputIndId, using the alias name OutputIndId.
     * @return the value of OutputIndId
     */
    public BigDecimal getOutputIndId() {
        return (BigDecimal) getAttributeInternal(OUTPUTINDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OutputIndId.
     * @param value value to set the OutputIndId
     */
    public void setOutputIndId(BigDecimal value) {
        setAttributeInternal(OUTPUTINDID, value);
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
     * Gets the attribute value for PhaseId, using the alias name PhaseId.
     * @return the value of PhaseId
     */
    public BigDecimal getPhaseId() {
        return (BigDecimal) getAttributeInternal(PHASEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PhaseId.
     * @param value value to set the PhaseId
     */
    public void setPhaseId(BigDecimal value) {
        setAttributeInternal(PHASEID, value);
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
    public RowIterator getTblMonParam() {
        return (RowIterator) getAttributeInternal(TBLMONPARAM);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblPhase() {
        return (EntityImpl) getAttributeInternal(TBLPHASE);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblPhase(EntityImpl value) {
        setAttributeInternal(TBLPHASE, value);
    }

    /**
     * @param outputIndId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal outputIndId) {
        return new Key(new Object[] { outputIndId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblOutputInd");
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

