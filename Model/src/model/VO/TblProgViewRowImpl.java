package model.VO;

import oracle.jbo.domain.Number;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat May 18 15:27:01 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblProgViewRowImpl extends ViewRowImpl {
    public static final int ENTITY_TBLPROG = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ProgId,
        Name,
        Ast,
        TblProgOffView,
        TblProjView,
        Active_Status1;
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
    public static final int PROGID = AttributesEnum.ProgId.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int TBLPROGOFFVIEW = AttributesEnum.TblProgOffView.index();
    public static final int TBLPROJVIEW = AttributesEnum.TblProjView.index();
    public static final int ACTIVE_STATUS1 = AttributesEnum.Active_Status1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblProgViewRowImpl() {
    }

    /**
     * Gets TblProg entity object.
     * @return the TblProg
     */
    public EntityImpl getTblProg() {
        return (EntityImpl) getEntity(ENTITY_TBLPROG);
    }
    
    /**
     * Gets the attribute value for PROG_ID using the alias name ProgId.
     * @return the PROG_ID
     */
    public Number getProgId() {
        return (Number) getAttributeInternal(PROGID);
    }

    /**
     * Sets <code>value</code> as attribute value for PROG_ID using the alias name ProgId.
     * @param value value to set the PROG_ID
     */
    public void setProgId(Number value) {
        setAttributeInternal(PROGID, value);
    }

    /**
     * Gets the attribute value for NAME using the alias name Name.
     * @return the NAME
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as attribute value for NAME using the alias name Name.
     * @param value value to set the NAME
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for AST using the alias name Ast.
     * @return the AST
     */
    public String getAst() {
        return (String) getAttributeInternal(AST);
    }

    /**
     * Sets <code>value</code> as attribute value for AST using the alias name Ast.
     * @param value value to set the AST
     */
    public void setAst(String value) {
        setAttributeInternal(AST, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link TblProgOffView.
     */
    public RowIterator getTblProgOffView() {
        return (RowIterator) getAttributeInternal(TBLPROGOFFVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link TblProjView.
     */
    public RowIterator getTblProjView() {
        return (RowIterator) getAttributeInternal(TBLPROJVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Active_Status1.
     */
    public RowSet getActive_Status1() {
        return (RowSet) getAttributeInternal(ACTIVE_STATUS1);
    }
}

