/* This file was generated by SableCC (http://www.sablecc.org/). */

package oog.syntax.node;

import oog.syntax.analysis.*;

@SuppressWarnings("nls")
public final class AEqualModifier extends PModifier
{
    private TIdent _ident_;
    private TEqual _equal_;
    private TNum _num_;

    public AEqualModifier()
    {
        // Constructor
    }

    public AEqualModifier(
        @SuppressWarnings("hiding") TIdent _ident_,
        @SuppressWarnings("hiding") TEqual _equal_,
        @SuppressWarnings("hiding") TNum _num_)
    {
        // Constructor
        setIdent(_ident_);

        setEqual(_equal_);

        setNum(_num_);

    }

    @Override
    public Object clone()
    {
        return new AEqualModifier(
            cloneNode(this._ident_),
            cloneNode(this._equal_),
            cloneNode(this._num_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEqualModifier(this);
    }

    public TIdent getIdent()
    {
        return this._ident_;
    }

    public void setIdent(TIdent node)
    {
        if(this._ident_ != null)
        {
            this._ident_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ident_ = node;
    }

    public TEqual getEqual()
    {
        return this._equal_;
    }

    public void setEqual(TEqual node)
    {
        if(this._equal_ != null)
        {
            this._equal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._equal_ = node;
    }

    public TNum getNum()
    {
        return this._num_;
    }

    public void setNum(TNum node)
    {
        if(this._num_ != null)
        {
            this._num_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._num_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ident_)
            + toString(this._equal_)
            + toString(this._num_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ident_ == child)
        {
            this._ident_ = null;
            return;
        }

        if(this._equal_ == child)
        {
            this._equal_ = null;
            return;
        }

        if(this._num_ == child)
        {
            this._num_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ident_ == oldChild)
        {
            setIdent((TIdent) newChild);
            return;
        }

        if(this._equal_ == oldChild)
        {
            setEqual((TEqual) newChild);
            return;
        }

        if(this._num_ == oldChild)
        {
            setNum((TNum) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}