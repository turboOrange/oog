/* This file was generated by SableCC (http://www.sablecc.org/). */

package oog.syntax.node;

import oog.syntax.analysis.*;

@SuppressWarnings("nls")
public final class AEventdef extends PEventdef
{
    private TEvent _event_;
    private TIdent _ident_;
    private TDotDot _dotDot_;
    private PExitlist _exitlist_;

    public AEventdef()
    {
        // Constructor
    }

    public AEventdef(
        @SuppressWarnings("hiding") TEvent _event_,
        @SuppressWarnings("hiding") TIdent _ident_,
        @SuppressWarnings("hiding") TDotDot _dotDot_,
        @SuppressWarnings("hiding") PExitlist _exitlist_)
    {
        // Constructor
        setEvent(_event_);

        setIdent(_ident_);

        setDotDot(_dotDot_);

        setExitlist(_exitlist_);

    }

    @Override
    public Object clone()
    {
        return new AEventdef(
            cloneNode(this._event_),
            cloneNode(this._ident_),
            cloneNode(this._dotDot_),
            cloneNode(this._exitlist_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEventdef(this);
    }

    public TEvent getEvent()
    {
        return this._event_;
    }

    public void setEvent(TEvent node)
    {
        if(this._event_ != null)
        {
            this._event_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._event_ = node;
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

    public PExitlist getExitlist()
    {
        return this._exitlist_;
    }

    public void setExitlist(PExitlist node)
    {
        if(this._exitlist_ != null)
        {
            this._exitlist_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exitlist_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._event_)
            + toString(this._ident_)
            + toString(this._dotDot_)
            + toString(this._exitlist_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._event_ == child)
        {
            this._event_ = null;
            return;
        }

        if(this._ident_ == child)
        {
            this._ident_ = null;
            return;
        }

        if(this._dotDot_ == child)
        {
            this._dotDot_ = null;
            return;
        }

        if(this._exitlist_ == child)
        {
            this._exitlist_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._event_ == oldChild)
        {
            setEvent((TEvent) newChild);
            return;
        }

        if(this._ident_ == oldChild)
        {
            setIdent((TIdent) newChild);
            return;
        }

        if(this._dotDot_ == oldChild)
        {
            setDotDot((TDotDot) newChild);
            return;
        }

        if(this._exitlist_ == oldChild)
        {
            setExitlist((PExitlist) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}