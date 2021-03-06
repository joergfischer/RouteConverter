/*
    This file is part of RouteConverter.

    RouteConverter is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    RouteConverter is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with RouteConverter; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

    Copyright (C) 2007 Christian Pesch. All Rights Reserved.
*/
package slash.navigation.maps.mapsforge.impl;

import org.mapsforge.map.layer.download.tilesource.AbstractTileSource;
import slash.navigation.common.BoundingBox;
import slash.navigation.maps.mapsforge.LocalMap;

import java.io.File;

/**
 * A {@link LocalMap} that is rendered from a local vector data set.
 *
 * @author Christian Pesch
 */

public class VectorMap extends LocaleResourceImpl implements LocalMap {
    private final File file;
    private final BoundingBox boundingBox;

    public VectorMap(String description, String url, BoundingBox boundingBox, File file, String copyrightText) {
        super(description, url, copyrightText);
        this.boundingBox = boundingBox;
        this.file = file;
    }

    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    public File getFile() {
        return file;
    }

    public AbstractTileSource getTileSource() {
        throw new UnsupportedOperationException();
    }

    public boolean isVector() {
        return true;
    }
}
