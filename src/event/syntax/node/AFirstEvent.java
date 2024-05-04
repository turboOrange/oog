/* This file was generated by SableCC (http://www.sablecc.org/). */

package event.syntax.node;

import event.syntax.analysis.*;

@SuppressWarnings("nls")
public final class AFirstEvent extends PEvent
{
    private TFirst _first_;
    private TIdent _type_;
    private TIdent _name_;
    private TDotDot _dotDot_;
    private PAgregation _agregation_;

    public AFirstEvent()
    {
        // Constructor
    }

    public AFirstEvent(
        @SuppressWarnings("hiding") TFirst _first_,
        @SuppressWarnings("hiding") TIdent _type_,
        @SuppressWarnings("hiding") TIdent _name_,
        @SuppressWarnings("hiding") TDotDot _dotDot_,
        @SuppressWarnings("hiding") PAgregation _agregation_)
    {
        // Constructor
        setFirst(_first_);

        setType(_type_);

        setName(_name_);

        setDotDot(_dotDot_);

        setAgregation(_agregation_);

    }

    @Override
    public Object clone()
    {
        return new AFirstEvent(
            cloneNode(this._first_),
            cloneNode(this._type_),
            cloneNode(this._name_),
            cloneNode(this._dotDot_),
            cloneNode(this._agregation_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFirstEvent(this);
    }

    public TFirst getFirst()
    {
        return this._first_;
    }

    public void setFirst(TFirst node)
    {
        if(this._first_ != null)
        {
            this._first_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._first_ = node;
    }

    public TIdent getType()
    {
        return this._type_;
    }

    public void setType(TIdent node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
    }

    public TIdent getName()
    {
        return this._name_;
    }

    public void setName(TIdent node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
    }

    public TDotDot getDotDot()
    {
        return this._dotDot_;
    }

    public void setDotDot(TDotDot node)
    {
        if(this._dotDot_ != null)
        {
            this._dotDot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dotDot_ = node;
    }

    public PAgregation getAgregation()
    {
        return this._agregation_;
    }

    public void setAgregation(PAgregation node)
    {
        if(this._agregation_ != null)
        {
            this._agregation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._agregation_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._first_)
            + toString(this._type_)
            + toString(this._name_)
            + toString(this._dotDot_)
            + toString(this._agregation_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._first_ == child)
        {
            this._first_ = null;
            return;
        }

        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._dotDot_ == child)
        {
            this._dotDot_ = null;
            return;
        }

        if(this._agregation_ == child)
        {
            this._agregation_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._first_ == oldChild)
        {
            setFirst((TFirst) newChild);
            return;
        }

        if(this._type_ == oldChild)
        {
            setType((TIdent) newChild);
            return;
        }

        if(this._name_ == oldChild)
        {
            setName((TIdent) newChild);
            return;
        }

        if(this._dotDot_ == oldChild)
        {
            setDotDot((TDotDot) newChild);
            return;
        }

        if(this._agregation_ == oldChild)
        {
            setAgregation((PAgregation) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}