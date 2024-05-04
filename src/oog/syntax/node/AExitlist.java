/* This file was generated by SableCC (http://www.sablecc.org/). */

package oog.syntax.node;

import java.util.*;
import oog.syntax.analysis.*;

@SuppressWarnings("nls")
public final class AExitlist extends PExitlist
{
    private TLBrace _lBrace_;
    private final LinkedList<PExitstm> _exitstm_ = new LinkedList<PExitstm>();
    private TRBrace _rBrace_;

    public AExitlist()
    {
        // Constructor
    }

    public AExitlist(
        @SuppressWarnings("hiding") TLBrace _lBrace_,
        @SuppressWarnings("hiding") List<?> _exitstm_,
        @SuppressWarnings("hiding") TRBrace _rBrace_)
    {
        // Constructor
        setLBrace(_lBrace_);

        setExitstm(_exitstm_);

        setRBrace(_rBrace_);

    }

    @Override
    public Object clone()
    {
        return new AExitlist(
            cloneNode(this._lBrace_),
            cloneList(this._exitstm_),
            cloneNode(this._rBrace_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExitlist(this);
    }

    public TLBrace getLBrace()
    {
        return this._lBrace_;
    }

    public void setLBrace(TLBrace node)
    {
        if(this._lBrace_ != null)
        {
            this._lBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBrace_ = node;
    }

    public LinkedList<PExitstm> getExitstm()
    {
        return this._exitstm_;
    }

    public void setExitstm(List<?> list)
    {
        for(PExitstm e : this._exitstm_)
        {
            e.parent(null);
        }
        this._exitstm_.clear();

        for(Object obj_e : list)
        {
            PExitstm e = (PExitstm) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._exitstm_.add(e);
        }
    }

    public TRBrace getRBrace()
    {
        return this._rBrace_;
    }

    public void setRBrace(TRBrace node)
    {
        if(this._rBrace_ != null)
        {
            this._rBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBrace_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lBrace_)
            + toString(this._exitstm_)
            + toString(this._rBrace_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lBrace_ == child)
        {
            this._lBrace_ = null;
            return;
        }

        if(this._exitstm_.remove(child))
        {
            return;
        }

        if(this._rBrace_ == child)
        {
            this._rBrace_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lBrace_ == oldChild)
        {
            setLBrace((TLBrace) newChild);
            return;
        }

        for(ListIterator<PExitstm> i = this._exitstm_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExitstm) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._rBrace_ == oldChild)
        {
            setRBrace((TRBrace) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
