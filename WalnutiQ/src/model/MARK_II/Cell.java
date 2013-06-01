package model.MARK_II;

import java.io.Serializable;

/**
 * Provides the minimal behaviors for a cell.
 *
 * @author Quinn Liu (quinnliu@vt.edu)
 * @author Michael Cogswell (cogswell@vt.edu)
 * @version MARK II | April 4, 2013
 */
public abstract class Cell implements Serializable {
    protected boolean isActive;

    public Cell() {
	this.isActive = false;
    }

    public boolean getActiveState() {
	return this.isActive;
    }

    public void setActiveState(boolean isActive) {
	this.isActive = isActive;
    }
}