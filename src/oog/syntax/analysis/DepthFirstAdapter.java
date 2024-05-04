/* This file was generated by SableCC (http://www.sablecc.org/). */

package oog.syntax.analysis;

import java.util.*;
import oog.syntax.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPProgram().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAProgram(AProgram node)
    {
        defaultIn(node);
    }

    public void outAProgram(AProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        inAProgram(node);
        {
            List<PVariabledef> copy = new ArrayList<PVariabledef>(node.getVariabledefs());
            for(PVariabledef e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PEventdef> copy = new ArrayList<PEventdef>(node.getEventdefs());
            for(PEventdef e : copy)
            {
                e.apply(this);
            }
        }
        outAProgram(node);
    }

    public void inAVariabledef(AVariabledef node)
    {
        defaultIn(node);
    }

    public void outAVariabledef(AVariabledef node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariabledef(AVariabledef node)
    {
        inAVariabledef(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getVisibility() != null)
        {
            node.getVisibility().apply(this);
        }
        if(node.getMin() != null)
        {
            node.getMin().apply(this);
        }
        if(node.getMax() != null)
        {
            node.getMax().apply(this);
        }
        if(node.getDefault() != null)
        {
            node.getDefault().apply(this);
        }
        outAVariabledef(node);
    }

    public void inAEventdef(AEventdef node)
    {
        defaultIn(node);
    }

    public void outAEventdef(AEventdef node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEventdef(AEventdef node)
    {
        inAEventdef(node);
        if(node.getEvent() != null)
        {
            node.getEvent().apply(this);
        }
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getDotDot() != null)
        {
            node.getDotDot().apply(this);
        }
        if(node.getExitlist() != null)
        {
            node.getExitlist().apply(this);
        }
        outAEventdef(node);
    }

    public void inAExitlist(AExitlist node)
    {
        defaultIn(node);
    }

    public void outAExitlist(AExitlist node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExitlist(AExitlist node)
    {
        inAExitlist(node);
        if(node.getLBrace() != null)
        {
            node.getLBrace().apply(this);
        }
        {
            List<PExitstm> copy = new ArrayList<PExitstm>(node.getExitstm());
            for(PExitstm e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getRBrace() != null)
        {
            node.getRBrace().apply(this);
        }
        outAExitlist(node);
    }

    public void inAExitstm(AExitstm node)
    {
        defaultIn(node);
    }

    public void outAExitstm(AExitstm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExitstm(AExitstm node)
    {
        inAExitstm(node);
        if(node.getExit() != null)
        {
            node.getExit().apply(this);
        }
        if(node.getNum() != null)
        {
            node.getNum().apply(this);
        }
        if(node.getArrow() != null)
        {
            node.getArrow().apply(this);
        }
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getModifierlist() != null)
        {
            node.getModifierlist().apply(this);
        }
        outAExitstm(node);
    }

    public void inAModifierlist(AModifierlist node)
    {
        defaultIn(node);
    }

    public void outAModifierlist(AModifierlist node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModifierlist(AModifierlist node)
    {
        inAModifierlist(node);
        if(node.getLSqPar() != null)
        {
            node.getLSqPar().apply(this);
        }
        {
            List<PModifier> copy = new ArrayList<PModifier>(node.getModifiers());
            for(PModifier e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getRSqPar() != null)
        {
            node.getRSqPar().apply(this);
        }
        outAModifierlist(node);
    }

    public void inAPlusModifier(APlusModifier node)
    {
        defaultIn(node);
    }

    public void outAPlusModifier(APlusModifier node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusModifier(APlusModifier node)
    {
        inAPlusModifier(node);
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getNum() != null)
        {
            node.getNum().apply(this);
        }
        outAPlusModifier(node);
    }

    public void inAMinusModifier(AMinusModifier node)
    {
        defaultIn(node);
    }

    public void outAMinusModifier(AMinusModifier node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusModifier(AMinusModifier node)
    {
        inAMinusModifier(node);
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getNum() != null)
        {
            node.getNum().apply(this);
        }
        outAMinusModifier(node);
    }

    public void inAEqualModifier(AEqualModifier node)
    {
        defaultIn(node);
    }

    public void outAEqualModifier(AEqualModifier node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqualModifier(AEqualModifier node)
    {
        inAEqualModifier(node);
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getEqual() != null)
        {
            node.getEqual().apply(this);
        }
        if(node.getNum() != null)
        {
            node.getNum().apply(this);
        }
        outAEqualModifier(node);
    }
}
