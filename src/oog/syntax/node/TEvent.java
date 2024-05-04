/* This file was generated by SableCC (http://www.sablecc.org/). */

package oog.syntax.node;

import oog.syntax.analysis.*;

@SuppressWarnings("nls")
public final class TEvent extends Token
{
    public TEvent()
    {
        super.setText("event");
    }

    public TEvent(int line, int pos)
    {
        super.setText("event");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEvent(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEvent(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEvent text.");
    }
}