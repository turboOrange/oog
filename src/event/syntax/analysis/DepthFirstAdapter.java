/* This file was generated by SableCC (http://www.sablecc.org/). */

package event.syntax.analysis;

import java.util.*;
import event.syntax.node.*;

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
            List<PEvent> copy = new ArrayList<PEvent>(node.getEvents());
            for(PEvent e : copy)
            {
                e.apply(this);
            }
        }
        outAProgram(node);
    }

    public void inAFirstEvent(AFirstEvent node)
    {
        defaultIn(node);
    }

    public void outAFirstEvent(AFirstEvent node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFirstEvent(AFirstEvent node)
    {
        inAFirstEvent(node);
        if(node.getFirst() != null)
        {
            node.getFirst().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        if(node.getDotDot() != null)
        {
            node.getDotDot().apply(this);
        }
        if(node.getAgregation() != null)
        {
            node.getAgregation().apply(this);
        }
        outAFirstEvent(node);
    }

    public void inANormalEvent(ANormalEvent node)
    {
        defaultIn(node);
    }

    public void outANormalEvent(ANormalEvent node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANormalEvent(ANormalEvent node)
    {
        inANormalEvent(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        if(node.getDotDot() != null)
        {
            node.getDotDot().apply(this);
        }
        if(node.getAgregation() != null)
        {
            node.getAgregation().apply(this);
        }
        outANormalEvent(node);
    }

    public void inAAgregation(AAgregation node)
    {
        defaultIn(node);
    }

    public void outAAgregation(AAgregation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAgregation(AAgregation node)
    {
        inAAgregation(node);
        if(node.getLBrace() != null)
        {
            node.getLBrace().apply(this);
        }
        {
            List<PAssosiation> copy = new ArrayList<PAssosiation>(node.getAssosiations());
            for(PAssosiation e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getRBrace() != null)
        {
            node.getRBrace().apply(this);
        }
        outAAgregation(node);
    }

    public void inADirectAssosiation(ADirectAssosiation node)
    {
        defaultIn(node);
    }

    public void outADirectAssosiation(ADirectAssosiation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADirectAssosiation(ADirectAssosiation node)
    {
        inADirectAssosiation(node);
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getDotDot() != null)
        {
            node.getDotDot().apply(this);
        }
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outADirectAssosiation(node);
    }

    public void inAIndirectAssosiation(AIndirectAssosiation node)
    {
        defaultIn(node);
    }

    public void outAIndirectAssosiation(AIndirectAssosiation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIndirectAssosiation(AIndirectAssosiation node)
    {
        inAIndirectAssosiation(node);
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getDotDot() != null)
        {
            node.getDotDot().apply(this);
        }
        if(node.getFile() != null)
        {
            node.getFile().apply(this);
        }
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAIndirectAssosiation(node);
    }

    public void inAChoiceAssosiation(AChoiceAssosiation node)
    {
        defaultIn(node);
    }

    public void outAChoiceAssosiation(AChoiceAssosiation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChoiceAssosiation(AChoiceAssosiation node)
    {
        inAChoiceAssosiation(node);
        if(node.getExit() != null)
        {
            node.getExit().apply(this);
        }
        if(node.getNum() != null)
        {
            node.getNum().apply(this);
        }
        if(node.getDotDot() != null)
        {
            node.getDotDot().apply(this);
        }
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAChoiceAssosiation(node);
    }
}