<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<!--Erzeugt mit KIT (www.kit.edu) GML-Toolbox, Erstellungsdatum: 06/19/18-->
<core:CityModel xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xsi:schemaLocation="http://www.opengis.net/citygml/2.0 http://www.citygmlwiki.org/images/a/ac/EnergyADE.xsd"
 xmlns:xAL="urn:oasis:names:tc:ciq:xsdschema:xAL:2.0"
 xmlns:app="http://www.opengis.net/citygml/appearance/2.0"
 xmlns:genobj="http://www.opengis.net/citygml/generics/2.0"
 xmlns:xlink="http://www.w3.org/1999/xlink"
 xmlns:xs="http://www.w3.org/2001/XMLSchema"
 xmlns:core="http://www.opengis.net/citygml/2.0"
 xmlns:gml="http://www.opengis.net/gml"
 xmlns:group="http://www.opengis.net/citygml/cityobjectgroup/2.0"
 xmlns:bldg="http://www.opengis.net/citygml/building/2.0"
 xmlns:energy="http://www.sig3d.org/citygml/2.0/energy/1.0"
 gml:id="GML_fc7dc1b5-759e-4ff1-8277-c0289bd01984">
  <gml:boundedBy>
    <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
      <gml:lowerCorner>458877 5438353 111.8</gml:lowerCorner>
      <gml:upperCorner>458889 5438363 118.31769</gml:upperCorner>
    </gml:Envelope>
  </gml:boundedBy>
  <core:cityObjectMember>
    <bldg:Building gml:id="UUID_d281adfc-4901-0f52-540b-4cc1a9325f82">
      <gml:description>FZK-Haus (Forschungszentrum Karlsruhe, now KIT), created by Karl-Heinz
                Haefele </gml:description>
      <gml:name>AC14-FZK-Haus</gml:name>
      <gml:boundedBy>
        <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
          <gml:lowerCorner>458877 5438353 111.8</gml:lowerCorner>
          <gml:upperCorner>458889 5438363 118.31769</gml:upperCorner>
        </gml:Envelope>
      </gml:boundedBy>
      <core:creationDate>2010-12-01</core:creationDate>
      <bldg:class>1000</bldg:class>
      <bldg:function>1000</bldg:function>
      <bldg:usage>1000</bldg:usage>
      <bldg:yearOfConstruction>2020</bldg:yearOfConstruction>
      <bldg:roofType>1030</bldg:roofType>
      <bldg:measuredHeight uom="m">6.51769145362398</bldg:measuredHeight>
      <bldg:storeysAboveGround>2</bldg:storeysAboveGround>
      <bldg:storeysBelowGround>0</bldg:storeysBelowGround>
      <bldg:boundedBy>
        <bldg:WallSurface gml:id="GML_5856d7ad-5e34-498a-817b-9544bfbb1475">
          <gml:name>Outer Wall 1 (West)</gml:name>
          <gml:boundedBy>
            <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
              <gml:lowerCorner>458877 5438353 111.8</gml:lowerCorner>
              <gml:upperCorner>458877 5438363 118.31769</gml:upperCorner>
            </gml:Envelope>
          </gml:boundedBy>
          <bldg:lod3MultiSurface>
            <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_0f66802a-d161-4f62-bb9f-a6a26148f6e6">
              <gml:surfaceMember>
                <gml:CompositeSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_e9240361-e956-421c-bff5-1f1f6d9b59aa">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58802_1543_379123_11561">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID58802_1543_379123_11561_0">
                          <gml:posList srsDimension="3" count="6">458877 5438358 118.31769 458877 5438363 115.43094 458877 5438363 111.8 458877 5438353 111.8 458877 5438353 115.43094 458877 5438358 118.31769 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                      <gml:interior>
                        <gml:LinearRing gml:id="PolyID58802_1543_379123_11561_1">
                          <gml:posList srsDimension="3" count="73">458877 5438358.48296 116.12940 458877 5438358.46984 116.17101 458877 5438358.45315 116.21130 458877 5438358.43301 116.25 458877 5438358.40957 116.28678 458877 5438358.38302 116.32139 458877 5438358.35355 116.35355 458877 5438358.32139 116.38302 458877 5438358.28678 116.40957 458877 5438358.25 116.43301 458877 5438358.21130 116.45315 458877 5438358.17101 116.46984 458877 5438358.12940 116.48296 458877 5438358.08682 116.49240 458877 5438358.04357 116.49809 458877 5438358 116.5 458877 5438357.95642 116.49809 458877 5438357.91317 116.49240 458877 5438357.87059 116.48296 458877 5438357.82898 116.46984 458877 5438357.78869 116.45315 458877 5438357.75 116.43301 458877 5438357.71321 116.40957 458877 5438357.67860 116.38302 458877 5438357.64644 116.35355 458877 5438357.61697 116.32139 458877 5438357.59042 116.28678 458877 5438357.56698 116.25 458877 5438357.54684 116.21130 458877 5438357.53015 116.17101 458877 5438357.51703 116.12940 458877 5438357.50759 116.08682 458877 5438357.50190 116.04357 458877 5438357.5 116 458877 5438357.50190 115.95642 458877 5438357.50759 115.91317 458877 5438357.51703 115.87059 458877 5438357.53015 115.82898 458877 5438357.54684 115.78869 458877 5438357.56698 115.75 458877 5438357.59042 115.71321 458877 5438357.61697 115.67860 458877 5438357.64644 115.64644 458877 5438357.67860 115.61697 458877 5438357.71321 115.59042 458877 5438357.75 115.56698 458877 5438357.78869 115.54684 458877 5438357.82898 115.53015 458877 5438357.87059 115.51703 458877 5438357.91317 115.50759 458877 5438357.95642 115.50190 458877 5438358 115.5 458877 5438358.04357 115.50190 458877 5438358.08682 115.50759 458877 5438358.12940 115.51703 458877 5438358.17101 115.53015 458877 5438358.21130 115.54684 458877 5438358.25 115.56698 458877 5438358.28678 115.59042 458877 5438358.32139 115.61697 458877 5438358.35355 115.64644 458877 5438358.38302 115.67860 458877 5438358.40957 115.71321 458877 5438358.43301 115.75 458877 5438358.45315 115.78869 458877 5438358.46984 115.82898 458877 5438358.48296 115.87059 458877 5438358.49240 115.91317 458877 5438358.49809 115.95642 458877 5438358.5 116 458877 5438358.49809 116.04357 458877 5438358.49240 116.08682 458877 5438358.48296 116.12940 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="PolyID58802_1543_379123_11561_2">
                          <gml:posList srsDimension="3" count="5">458877 5438357.495 114.01 458877 5438357.495 112 458877 5438358.505 112 458877 5438358.505 114.01 458877 5438357.495 114.01 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="PolyID58802_1543_379123_11561_3">
                          <gml:posList srsDimension="3" count="5">458877 5438359.495 114 458877 5438359.495 112.8 458877 5438361.495 112.8 458877 5438361.495 114 458877 5438359.495 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="PolyID58802_1543_379123_11561_4">
                          <gml:posList srsDimension="3" count="5">458877 5438356.205 114 458877 5438354.205 114 458877 5438354.205 112.8 458877 5438356.205 112.8 458877 5438356.205 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:CompositeSurface>
              </gml:surfaceMember>
            </gml:MultiSurface>
          </bldg:lod3MultiSurface>
          <bldg:opening>
            <bldg:Window gml:id="GML_356b85c1-25a0-49f9-b39e-013fbbafcce4">
              <gml:name>Window Round</gml:name>
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458877 5438357.5 115.5</gml:lowerCorner>
                  <gml:upperCorner>458877 5438358.5 116.5</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <bldg:lod3MultiSurface>
                <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_5e3ae1a7-49b6-41a7-aabe-327313e437a1">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58803_371_698036_77126">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID58803_371_698036_77126_0">
                          <gml:posList srsDimension="3" count="73">458877 5438358.40957 116.28678 458877 5438358.43301 116.25 458877 5438358.45315 116.21130 458877 5438358.46984 116.17101 458877 5438358.48296 116.12940 458877 5438358.49240 116.08682 458877 5438358.49809 116.04357 458877 5438358.5 116 458877 5438358.49809 115.95642 458877 5438358.49240 115.91317 458877 5438358.48296 115.87059 458877 5438358.46984 115.82898 458877 5438358.45315 115.78869 458877 5438358.43301 115.75 458877 5438358.40957 115.71321 458877 5438358.38302 115.67860 458877 5438358.35355 115.64644 458877 5438358.32139 115.61697 458877 5438358.28678 115.59042 458877 5438358.25 115.56698 458877 5438358.21130 115.54684 458877 5438358.17101 115.53015 458877 5438358.12940 115.51703 458877 5438358.08682 115.50759 458877 5438358.04357 115.50190 458877 5438358 115.5 458877 5438357.95642 115.50190 458877 5438357.91317 115.50759 458877 5438357.87059 115.51703 458877 5438357.82898 115.53015 458877 5438357.78869 115.54684 458877 5438357.75 115.56698 458877 5438357.71321 115.59042 458877 5438357.67860 115.61697 458877 5438357.64644 115.64644 458877 5438357.61697 115.67860 458877 5438357.59042 115.71321 458877 5438357.56698 115.75 458877 5438357.54684 115.78869 458877 5438357.53015 115.82898 458877 5438357.51703 115.87059 458877 5438357.50759 115.91317 458877 5438357.50190 115.95642 458877 5438357.5 116 458877 5438357.50190 116.04357 458877 5438357.50759 116.08682 458877 5438357.51703 116.12940 458877 5438357.53015 116.17101 458877 5438357.54684 116.21130 458877 5438357.56698 116.25 458877 5438357.59042 116.28678 458877 5438357.61697 116.32139 458877 5438357.64644 116.35355 458877 5438357.67860 116.38302 458877 5438357.71321 116.40957 458877 5438357.75 116.43301 458877 5438357.78869 116.45315 458877 5438357.82898 116.46984 458877 5438357.87059 116.48296 458877 5438357.91317 116.49240 458877 5438357.95642 116.49809 458877 5438358 116.5 458877 5438358.04357 116.49809 458877 5438358.08682 116.49240 458877 5438358.12940 116.48296 458877 5438358.17101 116.46984 458877 5438358.21130 116.45315 458877 5438358.25 116.43301 458877 5438358.28678 116.40957 458877 5438358.32139 116.38302 458877 5438358.35355 116.35355 458877 5438358.38302 116.32139 458877 5438358.40957 116.28678 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </bldg:lod3MultiSurface>
            </bldg:Window>
          </bldg:opening>
          <bldg:opening>
            <bldg:Window gml:id="GML_868be7d3-16c7-4dec-9ac6-5bb8ceb545bb">
              <gml:name>Window North</gml:name>
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458877 5438359.495 112.8</gml:lowerCorner>
                  <gml:upperCorner>458877 5438361.495 114</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <bldg:lod3MultiSurface>
                <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_27ba17f0-55a8-434c-954d-197e06830dc1">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58804_647_880710_163324">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID58804_647_880710_163324_0">
                          <gml:posList srsDimension="3" count="5">458877 5438359.495 114 458877 5438361.495 114 458877 5438361.495 112.8 458877 5438359.495 112.8 458877 5438359.495 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </bldg:lod3MultiSurface>
            </bldg:Window>
          </bldg:opening>
          <bldg:opening>
            <bldg:Door gml:id="GML_c137f11d-9a8c-4126-9aeb-9a6c9b4e1cbd">
              <gml:name>Door West</gml:name>
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458877 5438357.495 112</gml:lowerCorner>
                  <gml:upperCorner>458877 5438358.505 114.01</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <bldg:lod3MultiSurface>
                <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_3dc78c3f-35d4-4979-bcd5-a0686a475084">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58805_1881_773628_351228">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID58805_1881_773628_351228_0">
                          <gml:posList srsDimension="3" count="5">458877 5438357.495 114.01 458877 5438358.505 114.01 458877 5438358.505 112 458877 5438357.495 112 458877 5438357.495 114.01 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </bldg:lod3MultiSurface>
            </bldg:Door>
          </bldg:opening>
          <bldg:opening>
            <bldg:Window gml:id="GML_9e0e6137-a907-4e4b-bc30-a6b95641f4c0">
              <gml:name>Window South</gml:name>
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458877 5438354.205 112.8</gml:lowerCorner>
                  <gml:upperCorner>458877 5438356.205 114</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <bldg:lod3MultiSurface>
                <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_42d153c2-04c1-404c-8a48-1e7a5f60483a">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58806_328_642559_374120">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID58806_328_642559_374120_0">
                          <gml:posList srsDimension="3" count="5">458877 5438356.205 112.8 458877 5438354.205 112.8 458877 5438354.205 114 458877 5438356.205 114 458877 5438356.205 112.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </bldg:lod3MultiSurface>
            </bldg:Window>
          </bldg:opening>
        </bldg:WallSurface>
      </bldg:boundedBy>
      <bldg:boundedBy>
        <bldg:WallSurface gml:id="GML_d38cf762-c29d-4491-88c9-bdc89e141978">
          <gml:name>Outer Wall 2 (South)</gml:name>
          <gml:boundedBy>
            <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
              <gml:lowerCorner>458877 5438353 111.8</gml:lowerCorner>
              <gml:upperCorner>458889 5438353 115.43094</gml:upperCorner>
            </gml:Envelope>
          </gml:boundedBy>
          <bldg:lod3MultiSurface>
            <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_76f06d49-6e73-463f-9e4a-0858bfc6cb5d">
              <gml:surfaceMember>
                <gml:CompositeSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_4726d5c0-dfa2-4777-b1da-24798d72c27a">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58819_65_364244_211813">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID58819_65_364244_211813_0">
                          <gml:posList srsDimension="3" count="5">458889 5438353 115.43094 458877 5438353 115.43094 458877 5438353 111.8 458889 5438353 111.8 458889 5438353 115.43094 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                      <gml:interior>
                        <gml:LinearRing gml:id="PolyID58819_65_364244_211813_1">
                          <gml:posList srsDimension="3" count="5">458884.005 5438353 114.375 458884.005 5438353 112 458881.995 5438353 112 458881.995 5438353 114.375 458884.005 5438353 114.375 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="PolyID58819_65_364244_211813_2">
                          <gml:posList srsDimension="3" count="5">458885.21 5438353 114 458887.21 5438353 114 458887.21 5438353 112.8 458885.21 5438353 112.8 458885.21 5438353 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="PolyID58819_65_364244_211813_3">
                          <gml:posList srsDimension="3" count="5">458880.79 5438353 112.8 458878.79 5438353 112.8 458878.79 5438353 114 458880.79 5438353 114 458880.79 5438353 112.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:CompositeSurface>
              </gml:surfaceMember>
            </gml:MultiSurface>
          </bldg:lod3MultiSurface>
          <bldg:opening>
            <bldg:Window gml:id="GML_98d9c4f5-9e47-4f0b-95f3-cf31e7520142">
              <gml:name>Window East</gml:name>
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458885.21 5438353 112.8</gml:lowerCorner>
                  <gml:upperCorner>458887.21 5438353 114</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <bldg:lod3MultiSurface>
                <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_214d9076-9cf6-4de2-a797-7cab5fd8663b">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58820_1568_227087_210505">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID58820_1568_227087_210505_0">
                          <gml:posList srsDimension="3" count="5">458887.21 5438353 112.8 458887.21 5438353 114 458885.21 5438353 114 458885.21 5438353 112.8 458887.21 5438353 112.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </bldg:lod3MultiSurface>
            </bldg:Window>
          </bldg:opening>
          <bldg:opening>
            <bldg:Window gml:id="GML_d0f329f3-5b05-428d-87c3-945b3868337f">
              <gml:name>Window West</gml:name>
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458878.79 5438353 112.8</gml:lowerCorner>
                  <gml:upperCorner>458880.79 5438353 114</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <bldg:lod3MultiSurface>
                <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_d08e6c29-cef3-4ce6-b3c5-f81e9f9d7909">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58821_1939_612838_272028">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID58821_1939_612838_272028_0">
                          <gml:posList srsDimension="3" count="5">458878.79 5438353 112.8 458880.79 5438353 112.8 458880.79 5438353 114 458878.79 5438353 114 458878.79 5438353 112.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </bldg:lod3MultiSurface>
            </bldg:Window>
          </bldg:opening>
          <bldg:opening>
            <bldg:Door gml:id="GML_2d6ddf04-ee56-42a1-a9b1-b47e4181a629">
              <gml:name>Door South</gml:name>
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458881.995 5438353 112</gml:lowerCorner>
                  <gml:upperCorner>458884.005 5438353 114.375</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <bldg:lod3MultiSurface>
                <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_4031dc96-da2a-454c-9224-f1a64a9dcb4d">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58822_551_84845_215911">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID58822_551_84845_215911_0">
                          <gml:posList srsDimension="3" count="5">458884.005 5438353 112 458884.005 5438353 114.375 458881.995 5438353 114.375 458881.995 5438353 112 458884.005 5438353 112 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </bldg:lod3MultiSurface>
            </bldg:Door>
          </bldg:opening>
        </bldg:WallSurface>
      </bldg:boundedBy>
      <bldg:boundedBy>
        <bldg:WallSurface gml:id="GML_8e5db638-e46a-4739-a98a-2fc2d39c9069">
          <gml:name>Outer Wall 3 (East)</gml:name>
          <gml:boundedBy>
            <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
              <gml:lowerCorner>458889 5438353 111.8</gml:lowerCorner>
              <gml:upperCorner>458889 5438363 118.31769</gml:upperCorner>
            </gml:Envelope>
          </gml:boundedBy>
          <bldg:lod3MultiSurface>
            <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_3b08839e-36f4-4cac-a0e3-9db89b712618">
              <gml:surfaceMember>
                <gml:CompositeSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_d5729847-0aaf-4fec-8ed4-84a5300e510f">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58903_1839_642244_370862">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID58903_1839_642244_370862_0">
                          <gml:posList srsDimension="3" count="6">458889 5438358 118.31769 458889 5438353 115.43094 458889 5438353 111.8 458889 5438363 111.8 458889 5438363 115.43094 458889 5438358 118.31769 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                      <gml:interior>
                        <gml:LinearRing gml:id="PolyID58903_1839_642244_370862_1">
                          <gml:posList srsDimension="3" count="73">458889 5438357.51703 116.12940 458889 5438357.53015 116.17101 458889 5438357.54684 116.21130 458889 5438357.56698 116.25 458889 5438357.59042 116.28678 458889 5438357.61697 116.32139 458889 5438357.64644 116.35355 458889 5438357.67860 116.38302 458889 5438357.71321 116.40957 458889 5438357.75 116.43301 458889 5438357.78869 116.45315 458889 5438357.82898 116.46984 458889 5438357.87059 116.48296 458889 5438357.91317 116.49240 458889 5438357.95642 116.49809 458889 5438358 116.5 458889 5438358.04357 116.49809 458889 5438358.08682 116.49240 458889 5438358.12940 116.48296 458889 5438358.17101 116.46984 458889 5438358.21130 116.45315 458889 5438358.25 116.43301 458889 5438358.28678 116.40957 458889 5438358.32139 116.38302 458889 5438358.35355 116.35355 458889 5438358.38302 116.32139 458889 5438358.40957 116.28678 458889 5438358.43301 116.25 458889 5438358.45315 116.21130 458889 5438358.46984 116.17101 458889 5438358.48296 116.12940 458889 5438358.49240 116.08682 458889 5438358.49809 116.04357 458889 5438358.5 116 458889 5438358.49809 115.95642 458889 5438358.49240 115.91317 458889 5438358.48296 115.87059 458889 5438358.46984 115.82898 458889 5438358.45315 115.78869 458889 5438358.43301 115.75 458889 5438358.40957 115.71321 458889 5438358.38302 115.67860 458889 5438358.35355 115.64644 458889 5438358.32139 115.61697 458889 5438358.28678 115.59042 458889 5438358.25 115.56698 458889 5438358.21130 115.54684 458889 5438358.17101 115.53015 458889 5438358.12940 115.51703 458889 5438358.08682 115.50759 458889 5438358.04357 115.50190 458889 5438358 115.5 458889 5438357.95642 115.50190 458889 5438357.91317 115.50759 458889 5438357.87059 115.51703 458889 5438357.82898 115.53015 458889 5438357.78869 115.54684 458889 5438357.75 115.56698 458889 5438357.71321 115.59042 458889 5438357.67860 115.61697 458889 5438357.64644 115.64644 458889 5438357.61697 115.67860 458889 5438357.59042 115.71321 458889 5438357.56698 115.75 458889 5438357.54684 115.78869 458889 5438357.53015 115.82898 458889 5438357.51703 115.87059 458889 5438357.50759 115.91317 458889 5438357.50190 115.95642 458889 5438357.5 116 458889 5438357.50190 116.04357 458889 5438357.50759 116.08682 458889 5438357.51703 116.12940 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="PolyID58903_1839_642244_370862_2">
                          <gml:posList srsDimension="3" count="5">458889 5438361.50239 114 458889 5438361.50239 112.8 458889 5438359.50239 112.8 458889 5438359.50239 114 458889 5438361.50239 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="PolyID58903_1839_642244_370862_3">
                          <gml:posList srsDimension="3" count="5">458889 5438354.205 112.8 458889 5438354.205 114 458889 5438356.205 114 458889 5438356.205 112.8 458889 5438354.205 112.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:CompositeSurface>
              </gml:surfaceMember>
            </gml:MultiSurface>
          </bldg:lod3MultiSurface>
          <bldg:opening>
            <bldg:Window gml:id="GML_ef2a1635-4f3c-48b5-afda-53c920f3132b">
              <gml:name>Window South</gml:name>
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458889 5438354.205 112.8</gml:lowerCorner>
                  <gml:upperCorner>458889 5438356.205 114</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <bldg:lod3MultiSurface>
                <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_b35be65f-e85b-44fe-8514-d307679861ea">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58904_926_485070_129763">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID58904_926_485070_129763_0">
                          <gml:posList srsDimension="3" count="5">458889 5438356.205 112.8 458889 5438356.205 114 458889 5438354.205 114 458889 5438354.205 112.8 458889 5438356.205 112.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </bldg:lod3MultiSurface>
            </bldg:Window>
          </bldg:opening>
          <bldg:opening>
            <bldg:Window gml:id="GML_a216460a-3326-41f2-b867-6846d81724a4">
              <gml:name>Window North</gml:name>
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458889 5438359.50239 112.8</gml:lowerCorner>
                  <gml:upperCorner>458889 5438361.50239 114</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <bldg:lod3MultiSurface>
                <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_f7e0dff4-e746-4bc9-9181-ee15272c1e64">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58905_883_830507_79018">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID58905_883_830507_79018_0">
                          <gml:posList srsDimension="3" count="5">458889 5438361.50239 114 458889 5438359.50239 114 458889 5438359.50239 112.8 458889 5438361.50239 112.8 458889 5438361.50239 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </bldg:lod3MultiSurface>
            </bldg:Window>
          </bldg:opening>
          <bldg:opening>
            <bldg:Window gml:id="GML_23030a94-ccbc-4ce5-a0a4-9280c5b3f287">
              <gml:name>Window Round</gml:name>
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458889 5438357.5 115.5</gml:lowerCorner>
                  <gml:upperCorner>458889 5438358.5 116.5</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <bldg:lod3MultiSurface>
                <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_2ddab0c5-2803-4ef7-b332-88cdb59ee2c4">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58906_886_364949_26381">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID58906_886_364949_26381_0">
                          <gml:posList srsDimension="3" count="73">458889 5438357.61697 116.32139 458889 5438357.59042 116.28678 458889 5438357.56698 116.25 458889 5438357.54684 116.21130 458889 5438357.53015 116.17101 458889 5438357.51703 116.12940 458889 5438357.50759 116.08682 458889 5438357.50190 116.04357 458889 5438357.5 116 458889 5438357.50190 115.95642 458889 5438357.50759 115.91317 458889 5438357.51703 115.87059 458889 5438357.53015 115.82898 458889 5438357.54684 115.78869 458889 5438357.56698 115.75 458889 5438357.59042 115.71321 458889 5438357.61697 115.67860 458889 5438357.64644 115.64644 458889 5438357.67860 115.61697 458889 5438357.71321 115.59042 458889 5438357.75 115.56698 458889 5438357.78869 115.54684 458889 5438357.82898 115.53015 458889 5438357.87059 115.51703 458889 5438357.91317 115.50759 458889 5438357.95642 115.50190 458889 5438358 115.5 458889 5438358.04357 115.50190 458889 5438358.08682 115.50759 458889 5438358.12940 115.51703 458889 5438358.17101 115.53015 458889 5438358.21130 115.54684 458889 5438358.25 115.56698 458889 5438358.28678 115.59042 458889 5438358.32139 115.61697 458889 5438358.35355 115.64644 458889 5438358.38302 115.67860 458889 5438358.40957 115.71321 458889 5438358.43301 115.75 458889 5438358.45315 115.78869 458889 5438358.46984 115.82898 458889 5438358.48296 115.87059 458889 5438358.49240 115.91317 458889 5438358.49809 115.95642 458889 5438358.5 116 458889 5438358.49809 116.04357 458889 5438358.49240 116.08682 458889 5438358.48296 116.12940 458889 5438358.46984 116.17101 458889 5438358.45315 116.21130 458889 5438358.43301 116.25 458889 5438358.40957 116.28678 458889 5438358.38302 116.32139 458889 5438358.35355 116.35355 458889 5438358.32139 116.38302 458889 5438358.28678 116.40957 458889 5438358.25 116.43301 458889 5438358.21130 116.45315 458889 5438358.17101 116.46984 458889 5438358.12940 116.48296 458889 5438358.08682 116.49240 458889 5438358.04357 116.49809 458889 5438358 116.5 458889 5438357.95642 116.49809 458889 5438357.91317 116.49240 458889 5438357.87059 116.48296 458889 5438357.82898 116.46984 458889 5438357.78869 116.45315 458889 5438357.75 116.43301 458889 5438357.71321 116.40957 458889 5438357.67860 116.38302 458889 5438357.64644 116.35355 458889 5438357.61697 116.32139 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </bldg:lod3MultiSurface>
            </bldg:Window>
          </bldg:opening>
        </bldg:WallSurface>
      </bldg:boundedBy>
      <bldg:boundedBy>
        <bldg:RoofSurface gml:id="GML_875d470b-32b4-4985-a4c8-0f02caa342a2">
          <gml:name>Roof 1 (North)</gml:name>
          <gml:boundedBy>
            <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
              <gml:lowerCorner>458877 5438358 115.43094</gml:lowerCorner>
              <gml:upperCorner>458889 5438363 118.31769</gml:upperCorner>
            </gml:Envelope>
          </gml:boundedBy>
          <bldg:lod3MultiSurface>
            <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_88d8d763-d7e2-4097-8e70-e35550f2df24">
              <gml:surfaceMember>
                <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58907_1126_884498_121000">
                  <gml:exterior>
                    <gml:LinearRing gml:id="PolyID58907_1126_884498_121000_0">
                      <gml:posList srsDimension="3" count="5">458877 5438358 118.31769 458889 5438358 118.31769 458889 5438363 115.43094 458877 5438363 115.43094 458877 5438358 118.31769 </gml:posList>
                    </gml:LinearRing>
                  </gml:exterior>
                </gml:Polygon>
              </gml:surfaceMember>
            </gml:MultiSurface>
          </bldg:lod3MultiSurface>
        </bldg:RoofSurface>
      </bldg:boundedBy>
      <bldg:boundedBy>
        <bldg:WallSurface gml:id="GML_0f30f604-e70d-4dfe-ba35-853bc69609cc">
          <gml:name>Outer Wall 4 (North)</gml:name>
          <gml:boundedBy>
            <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
              <gml:lowerCorner>458877 5438363 111.8</gml:lowerCorner>
              <gml:upperCorner>458889 5438363 115.43094</gml:upperCorner>
            </gml:Envelope>
          </gml:boundedBy>
          <bldg:lod3MultiSurface>
            <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_a09ec2ed-513c-493d-882b-cb631d3633d8">
              <gml:surfaceMember>
                <gml:CompositeSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_b01f8d66-c797-49d3-b089-31349e167e4d">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58910_338_408556_67913">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID58910_338_408556_67913_0">
                          <gml:posList srsDimension="3" count="5">458877 5438363 115.43094 458889 5438363 115.43094 458889 5438363 111.8 458877 5438363 111.8 458877 5438363 115.43094 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                      <gml:interior>
                        <gml:LinearRing gml:id="PolyID58910_338_408556_67913_1">
                          <gml:posList srsDimension="3" count="5">458878.05 5438363 114 458878.05 5438363 112.8 458880.05 5438363 112.8 458880.05 5438363 114 458878.05 5438363 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="PolyID58910_338_408556_67913_2">
                          <gml:posList srsDimension="3" count="5">458887.795 5438363 114 458885.795 5438363 114 458885.795 5438363 112.8 458887.795 5438363 112.8 458887.795 5438363 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="PolyID58910_338_408556_67913_3">
                          <gml:posList srsDimension="3" count="5">458881.66 5438363 114 458881.66 5438363 112.8 458883.66 5438363 112.8 458883.66 5438363 114 458881.66 5438363 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:CompositeSurface>
              </gml:surfaceMember>
            </gml:MultiSurface>
          </bldg:lod3MultiSurface>
          <bldg:opening>
            <bldg:Window gml:id="GML_2297f8d4-f302-464c-8e7d-a26fd5dbd755">
              <gml:name>Window East</gml:name>
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458885.795 5438363 112.8</gml:lowerCorner>
                  <gml:upperCorner>458887.795 5438363 114</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <bldg:lod3MultiSurface>
                <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_6cdfadbd-b3fc-47aa-8bd8-b865fc8b419a">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58918_1666_508104_106792">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID58918_1666_508104_106792_0">
                          <gml:posList srsDimension="3" count="5">458887.795 5438363 112.8 458885.795 5438363 112.8 458885.795 5438363 114 458887.795 5438363 114 458887.795 5438363 112.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </bldg:lod3MultiSurface>
            </bldg:Window>
          </bldg:opening>
          <bldg:opening>
            <bldg:Window gml:id="GML_6087187b-284d-4064-9abf-85f9ba9b2c89">
              <gml:name>Window Middle</gml:name>
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458881.66 5438363 112.8</gml:lowerCorner>
                  <gml:upperCorner>458883.66 5438363 114</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <bldg:lod3MultiSurface>
                <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_4080d436-eda1-4037-a520-d8d2aabb42ca">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58919_293_365452_56524">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID58919_293_365452_56524_0">
                          <gml:posList srsDimension="3" count="5">458883.66 5438363 114 458883.66 5438363 112.8 458881.66 5438363 112.8 458881.66 5438363 114 458883.66 5438363 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </bldg:lod3MultiSurface>
            </bldg:Window>
          </bldg:opening>
          <bldg:opening>
            <bldg:Window gml:id="GML_5397681c-8367-4e9b-a989-60caec316f86">
              <gml:name>Window West</gml:name>
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458878.05 5438363 112.8</gml:lowerCorner>
                  <gml:upperCorner>458880.05 5438363 114</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <bldg:lod3MultiSurface>
                <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_30fc0d23-3c95-490a-9b73-8177bf757ced">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID45494_1549_894355_77993">
                      <gml:exterior>
                        <gml:LinearRing gml:id="PolyID45494_1549_894355_77993_0">
                          <gml:posList srsDimension="3" count="5">458878.05 5438363 112.8 458878.05 5438363 114 458880.05 5438363 114 458880.05 5438363 112.8 458878.05 5438363 112.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </bldg:lod3MultiSurface>
            </bldg:Window>
          </bldg:opening>
        </bldg:WallSurface>
      </bldg:boundedBy>
      <bldg:boundedBy>
        <bldg:RoofSurface gml:id="GML_eeb6796a-e261-4d3b-a6f2-475940cca80a">
          <gml:name>Roof 2 (South)</gml:name>
          <gml:boundedBy>
            <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
              <gml:lowerCorner>458877 5438353 115.43094</gml:lowerCorner>
              <gml:upperCorner>458889 5438358 118.31769</gml:upperCorner>
            </gml:Envelope>
          </gml:boundedBy>
          <bldg:lod3MultiSurface>
            <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_7fbad861-a61f-48e4-a6f9-c93e05510ee8">
              <gml:surfaceMember>
                <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58921_472_579834_340993">
                  <gml:exterior>
                    <gml:LinearRing gml:id="PolyID58921_472_579834_340993_0">
                      <gml:posList srsDimension="3" count="5">458889 5438353 115.43094 458889 5438358 118.31769 458877 5438358 118.31769 458877 5438353 115.43094 458889 5438353 115.43094 </gml:posList>
                    </gml:LinearRing>
                  </gml:exterior>
                </gml:Polygon>
              </gml:surfaceMember>
            </gml:MultiSurface>
          </bldg:lod3MultiSurface>
        </bldg:RoofSurface>
      </bldg:boundedBy>
      <bldg:boundedBy>
        <bldg:GroundSurface gml:id="GML_257a8dde-8194-4ca3-b581-abd591dcd6a3">
          <gml:description>Bodenplatte</gml:description>
          <gml:name>Base Surface</gml:name>
          <gml:boundedBy>
            <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
              <gml:lowerCorner>458877 5438353 111.8</gml:lowerCorner>
              <gml:upperCorner>458889 5438363 111.8</gml:upperCorner>
            </gml:Envelope>
          </gml:boundedBy>
          <bldg:lod3MultiSurface>
            <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_36965f01-5533-4aa2-997e-192a65ae66c7">
              <gml:surfaceMember>
                <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="PolyID58922_1541_340473_350668">
                  <gml:exterior>
                    <gml:LinearRing gml:id="PolyID58922_1541_340473_350668_0">
                      <gml:posList srsDimension="3" count="5">458889 5438353 111.8 458877 5438353 111.8 458877 5438363 111.8 458889 5438363 111.8 458889 5438353 111.8 </gml:posList>
                    </gml:LinearRing>
                  </gml:exterior>
                </gml:Polygon>
              </gml:surfaceMember>
            </gml:MultiSurface>
          </bldg:lod3MultiSurface>
        </bldg:GroundSurface>
      </bldg:boundedBy>
      <bldg:lod3Solid>
        <gml:Solid gml:id="GML_85998084-9d6f-438a-910d-1b6ddf206048">
          <gml:exterior>
            <gml:CompositeSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_2268b8bd-7850-4876-b221-411590443d26">
              <gml:surfaceMember xlink:href="#PolyID58907_1126_884498_121000" />
              <gml:surfaceMember xlink:href="#PolyID58921_472_579834_340993" />
              <gml:surfaceMember xlink:href="#PolyID58922_1541_340473_350668" />
              <gml:surfaceMember xlink:href="#GML_b01f8d66-c797-49d3-b089-31349e167e4d" />
              <gml:surfaceMember xlink:href="#PolyID58918_1666_508104_106792" />
              <gml:surfaceMember xlink:href="#PolyID58919_293_365452_56524" />
              <gml:surfaceMember xlink:href="#PolyID45494_1549_894355_77993" />
              <gml:surfaceMember xlink:href="#GML_d5729847-0aaf-4fec-8ed4-84a5300e510f" />
              <gml:surfaceMember xlink:href="#PolyID58906_886_364949_26381" />
              <gml:surfaceMember xlink:href="#PolyID58905_883_830507_79018" />
              <gml:surfaceMember xlink:href="#PolyID58904_926_485070_129763" />
              <gml:surfaceMember xlink:href="#GML_e9240361-e956-421c-bff5-1f1f6d9b59aa" />
              <gml:surfaceMember xlink:href="#PolyID58803_371_698036_77126" />
              <gml:surfaceMember xlink:href="#PolyID58804_647_880710_163324" />
              <gml:surfaceMember xlink:href="#PolyID58805_1881_773628_351228" />
              <gml:surfaceMember xlink:href="#PolyID58806_328_642559_374120" />
              <gml:surfaceMember xlink:href="#GML_4726d5c0-dfa2-4777-b1da-24798d72c27a" />
              <gml:surfaceMember xlink:href="#PolyID58820_1568_227087_210505" />
              <gml:surfaceMember xlink:href="#PolyID58821_1939_612838_272028" />
              <gml:surfaceMember xlink:href="#PolyID58822_551_84845_215911" />
            </gml:CompositeSurface>
          </gml:exterior>
        </gml:Solid>
      </bldg:lod3Solid>
      <energy:constructionWeight>medium</energy:constructionWeight>
      <energy:volume>
        <energy:VolumeType>
          <energy:type>grossVolume</energy:type>
          <energy:value uom="m3">608.917893677988</energy:value>
        </energy:VolumeType>
      </energy:volume>
      <energy:referencePoint>
        <gml:Point srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_d2b5cd60-45a3-41f2-b0d8-db58abdef97e">
          <gml:pos>458883 5438358 115.05884</gml:pos>
        </gml:Point>
      </energy:referencePoint>
      <energy:thermalZone>
        <energy:ThermalZone gml:id="GML_0d710724-1143-47e2-b824-0dadf29c1a84">
          <gml:boundedBy>
            <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
              <gml:lowerCorner>458877 5438353 111.8</gml:lowerCorner>
              <gml:upperCorner>458889 5438363 118.31769</gml:upperCorner>
            </gml:Envelope>
          </gml:boundedBy>
          <energy:contains xlink:href="#GML_f7f94cac-3601-4c1d-a9ed-868ecdd42ea4" />
          <energy:floorArea>
            <energy:FloorArea>
              <energy:type>grossFloorArea</energy:type>
              <energy:value uom="m2">240</energy:value>
            </energy:FloorArea>
          </energy:floorArea>
          <energy:volume>
            <energy:VolumeType>
              <energy:type>grossVolume</energy:type>
              <energy:value uom="m3">608.917893677988</energy:value>
            </energy:VolumeType>
          </energy:volume>
          <energy:isCooled>false</energy:isCooled>
          <energy:isHeated>true</energy:isHeated>
          <energy:volumeGeometry>
            <gml:Solid gml:id="GML_44174c43-226f-4e39-8ebf-87b08a60b3b1">
              <gml:exterior>
                <gml:CompositeSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_ce6d43d9-9ca4-4758-ae82-7a2fa3f86e98">
                  <gml:surfaceMember xlink:href="#PolyID58907_1126_884498_121000" />
                  <gml:surfaceMember xlink:href="#PolyID58921_472_579834_340993" />
                  <gml:surfaceMember xlink:href="#PolyID58922_1541_340473_350668" />
                  <gml:surfaceMember xlink:href="#GML_b01f8d66-c797-49d3-b089-31349e167e4d" />
                  <gml:surfaceMember xlink:href="#PolyID58918_1666_508104_106792" />
                  <gml:surfaceMember xlink:href="#PolyID58919_293_365452_56524" />
                  <gml:surfaceMember xlink:href="#PolyID45494_1549_894355_77993" />
                  <gml:surfaceMember xlink:href="#GML_d5729847-0aaf-4fec-8ed4-84a5300e510f" />
                  <gml:surfaceMember xlink:href="#PolyID58906_886_364949_26381" />
                  <gml:surfaceMember xlink:href="#PolyID58905_883_830507_79018" />
                  <gml:surfaceMember xlink:href="#PolyID58904_926_485070_129763" />
                  <gml:surfaceMember xlink:href="#GML_e9240361-e956-421c-bff5-1f1f6d9b59aa" />
                  <gml:surfaceMember xlink:href="#PolyID58803_371_698036_77126" />
                  <gml:surfaceMember xlink:href="#PolyID58804_647_880710_163324" />
                  <gml:surfaceMember xlink:href="#PolyID58805_1881_773628_351228" />
                  <gml:surfaceMember xlink:href="#PolyID58806_328_642559_374120" />
                  <gml:surfaceMember xlink:href="#GML_4726d5c0-dfa2-4777-b1da-24798d72c27a" />
                  <gml:surfaceMember xlink:href="#PolyID58820_1568_227087_210505" />
                  <gml:surfaceMember xlink:href="#PolyID58821_1939_612838_272028" />
                  <gml:surfaceMember xlink:href="#PolyID58822_551_84845_215911" />
                </gml:CompositeSurface>
              </gml:exterior>
            </gml:Solid>
          </energy:volumeGeometry>
          <energy:boundedBy>
            <energy:ThermalBoundary gml:id="GML_8f4c4939-9891-46e7-9065-a054ea36bb4c">
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458877 5438363 111.8</gml:lowerCorner>
                  <gml:upperCorner>458889 5438363 115.43094</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <energy:thermalBoundaryType>outerWall</energy:thermalBoundaryType>
              <energy:azimuth uom="deg">0</energy:azimuth>
              <energy:inclination uom="deg">90</energy:inclination>
              <energy:area uom="m2">43.571281292110257</energy:area>
              <energy:surfaceGeometry>
                <gml:MultiSurface gml:id="GML_15ceb1d9-343b-4879-ac76-5f3de863813b">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_c7320715-910b-470e-b335-6de7fdce3ca9">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_a2824c8b-b95c-4671-b19b-97b9985f0e1f">
                          <gml:posList srsDimension="3" count="5">458877 5438363 115.43094 458889 5438363 115.43094 458889 5438363 111.8 458877 5438363 111.8 458877 5438363 115.43094 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                      <gml:interior>
                        <gml:LinearRing gml:id="GML_a2df32a7-4b76-41f0-bb3c-ed05b2a1f635">
                          <gml:posList srsDimension="3" count="5">458878.05 5438363 114 458878.05 5438363 112.8 458880.05 5438363 112.8 458880.05 5438363 114 458878.05 5438363 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="GML_33f0bc3d-9c45-422e-8da0-540b26bc3c5a">
                          <gml:posList srsDimension="3" count="5">458887.795 5438363 114 458885.795 5438363 114 458885.795 5438363 112.8 458887.795 5438363 112.8 458887.795 5438363 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="GML_c656d944-2b86-4d9f-b1bc-d7610d9605ae">
                          <gml:posList srsDimension="3" count="5">458881.66 5438363 114 458881.66 5438363 112.8 458883.66 5438363 112.8 458883.66 5438363 114 458881.66 5438363 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_c9141d0b-0c50-46fa-a711-f7c6f5b83c6f">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_dbe334da-1e3c-4e27-ad1c-e56bf9cae053">
                          <gml:posList srsDimension="3" count="5">458887.795 5438363 112.8 458885.795 5438363 112.8 458885.795 5438363 114 458887.795 5438363 114 458887.795 5438363 112.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_fb9c22bd-eec4-49f4-bc3e-1f6795dbcb53">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_50f3636b-d8b8-458e-a884-19880f6bfc23">
                          <gml:posList srsDimension="3" count="5">458883.66 5438363 114 458883.66 5438363 112.8 458881.66 5438363 112.8 458881.66 5438363 114 458883.66 5438363 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_7a83818f-edab-403c-867c-bb33e698aebb">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_1ee055a2-97dc-429b-ba5f-31ce625c3944">
                          <gml:posList srsDimension="3" count="5">458878.05 5438363 112.8 458878.05 5438363 114 458880.05 5438363 114 458880.05 5438363 112.8 458878.05 5438363 112.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </energy:surfaceGeometry>
              <energy:construction xlink:href="#GML_d2366771-6937-42fd-b25f-2f0cf586aa86" />
              <energy:contains>
                <energy:ThermalOpening gml:id="GML_e194ad41-bce9-4e2d-8edd-afcb9f243181">
                  <gml:boundedBy>
                    <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                      <gml:lowerCorner>458885.795 5438363 112.8</gml:lowerCorner>
                      <gml:upperCorner>458887.795 5438363 114</gml:upperCorner>
                    </gml:Envelope>
                  </gml:boundedBy>
                  <energy:area uom="m2">2.4000000000000057</energy:area>
                  <energy:construction xlink:href="#GML_102fe10f-7faf-4c62-97ef-a6d858d9790d" />
                  <energy:surfaceGeometry>
                    <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_7eb80633-11e9-487e-9af9-ea094f130569">
                      <gml:surfaceMember>
                        <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_7dd4bc88-c43c-49fe-a306-784470831fb0">
                          <gml:exterior>
                            <gml:LinearRing gml:id="GML_d2188937-58a0-40c0-a057-77d3f4f19635">
                              <gml:posList srsDimension="3" count="5">458887.795 5438363 112.8 458885.795 5438363 112.8 458885.795 5438363 114 458887.795 5438363 114 458887.795 5438363 112.8 </gml:posList>
                            </gml:LinearRing>
                          </gml:exterior>
                        </gml:Polygon>
                      </gml:surfaceMember>
                    </gml:MultiSurface>
                  </energy:surfaceGeometry>
                </energy:ThermalOpening>
              </energy:contains>
              <energy:contains>
                <energy:ThermalOpening gml:id="GML_cad2a7ab-ca30-4ccb-8d39-40d5cc87e0a5">
                  <gml:boundedBy>
                    <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                      <gml:lowerCorner>458881.66 5438363 112.8</gml:lowerCorner>
                      <gml:upperCorner>458883.66 5438363 114</gml:upperCorner>
                    </gml:Envelope>
                  </gml:boundedBy>
                  <energy:area uom="m2">2.4000000000000057</energy:area>
                  <energy:construction xlink:href="#GML_102fe10f-7faf-4c62-97ef-a6d858d9790d" />
                  <energy:surfaceGeometry>
                    <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_b694c1b5-5842-45c7-b02a-b54b9f44e16b">
                      <gml:surfaceMember>
                        <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_558b0910-5d05-40df-9a41-f3adace62d5e">
                          <gml:exterior>
                            <gml:LinearRing gml:id="GML_43fbd5f9-a266-4127-900d-0c833022c60a">
                              <gml:posList srsDimension="3" count="5">458883.66 5438363 114 458883.66 5438363 112.8 458881.66 5438363 112.8 458881.66 5438363 114 458883.66 5438363 114 </gml:posList>
                            </gml:LinearRing>
                          </gml:exterior>
                        </gml:Polygon>
                      </gml:surfaceMember>
                    </gml:MultiSurface>
                  </energy:surfaceGeometry>
                </energy:ThermalOpening>
              </energy:contains>
              <energy:contains>
                <energy:ThermalOpening gml:id="GML_791aca22-218c-4c06-a70b-21d1b3624701">
                  <gml:boundedBy>
                    <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                      <gml:lowerCorner>458878.05 5438363 112.8</gml:lowerCorner>
                      <gml:upperCorner>458880.05 5438363 114</gml:upperCorner>
                    </gml:Envelope>
                  </gml:boundedBy>
                  <energy:area uom="m2">2.4000000000000057</energy:area>
                  <energy:construction xlink:href="#GML_102fe10f-7faf-4c62-97ef-a6d858d9790d" />
                  <energy:surfaceGeometry>
                    <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_4138ce5f-cfc0-41a5-84ea-09ca0fef47ef">
                      <gml:surfaceMember>
                        <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_51c52b6e-c19f-4554-b822-46bd23c66294">
                          <gml:exterior>
                            <gml:LinearRing gml:id="GML_9d4c5699-081a-44d7-8914-8e353c2ed360">
                              <gml:posList srsDimension="3" count="5">458878.05 5438363 112.8 458878.05 5438363 114 458880.05 5438363 114 458880.05 5438363 112.8 458878.05 5438363 112.8 </gml:posList>
                            </gml:LinearRing>
                          </gml:exterior>
                        </gml:Polygon>
                      </gml:surfaceMember>
                    </gml:MultiSurface>
                  </energy:surfaceGeometry>
                </energy:ThermalOpening>
              </energy:contains>
              <energy:delimits xlink:href="#GML_0d710724-1143-47e2-b824-0dadf29c1a84" />
            </energy:ThermalBoundary>
          </energy:boundedBy>
          <energy:boundedBy>
            <energy:ThermalBoundary gml:id="GML_4cb4089f-2a37-4fef-938f-dae908141e22">
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458877 5438353 111.8</gml:lowerCorner>
                  <gml:upperCorner>458877 5438363 118.31769</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <energy:thermalBoundaryType>outerWall</energy:thermalBoundaryType>
              <energy:azimuth uom="deg">270</energy:azimuth>
              <energy:inclination uom="deg">90</energy:inclination>
              <energy:area uom="m2">50.743157806499184</energy:area>
              <energy:surfaceGeometry>
                <gml:MultiSurface gml:id="GML_fe3ff0bf-cf6f-4252-86ae-247e28246634">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_e71cbed5-21ea-4d66-90f6-2482c2ab17d4">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_acf653cd-3d4d-48d0-bb37-f9a2455f7742">
                          <gml:posList srsDimension="3" count="6">458877 5438358 118.31769 458877 5438363 115.43094 458877 5438363 111.8 458877 5438353 111.8 458877 5438353 115.43094 458877 5438358 118.31769 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                      <gml:interior>
                        <gml:LinearRing gml:id="GML_7408c372-4f70-42c6-849c-e860c8552ab4">
                          <gml:posList srsDimension="3" count="73">458877 5438358.48296 116.12940 458877 5438358.46984 116.17101 458877 5438358.45315 116.21130 458877 5438358.43301 116.25 458877 5438358.40957 116.28678 458877 5438358.38302 116.32139 458877 5438358.35355 116.35355 458877 5438358.32139 116.38302 458877 5438358.28678 116.40957 458877 5438358.25 116.43301 458877 5438358.21130 116.45315 458877 5438358.17101 116.46984 458877 5438358.12940 116.48296 458877 5438358.08682 116.49240 458877 5438358.04357 116.49809 458877 5438358 116.5 458877 5438357.95642 116.49809 458877 5438357.91317 116.49240 458877 5438357.87059 116.48296 458877 5438357.82898 116.46984 458877 5438357.78869 116.45315 458877 5438357.75 116.43301 458877 5438357.71321 116.40957 458877 5438357.67860 116.38302 458877 5438357.64644 116.35355 458877 5438357.61697 116.32139 458877 5438357.59042 116.28678 458877 5438357.56698 116.25 458877 5438357.54684 116.21130 458877 5438357.53015 116.17101 458877 5438357.51703 116.12940 458877 5438357.50759 116.08682 458877 5438357.50190 116.04357 458877 5438357.5 116 458877 5438357.50190 115.95642 458877 5438357.50759 115.91317 458877 5438357.51703 115.87059 458877 5438357.53015 115.82898 458877 5438357.54684 115.78869 458877 5438357.56698 115.75 458877 5438357.59042 115.71321 458877 5438357.61697 115.67860 458877 5438357.64644 115.64644 458877 5438357.67860 115.61697 458877 5438357.71321 115.59042 458877 5438357.75 115.56698 458877 5438357.78869 115.54684 458877 5438357.82898 115.53015 458877 5438357.87059 115.51703 458877 5438357.91317 115.50759 458877 5438357.95642 115.50190 458877 5438358 115.5 458877 5438358.04357 115.50190 458877 5438358.08682 115.50759 458877 5438358.12940 115.51703 458877 5438358.17101 115.53015 458877 5438358.21130 115.54684 458877 5438358.25 115.56698 458877 5438358.28678 115.59042 458877 5438358.32139 115.61697 458877 5438358.35355 115.64644 458877 5438358.38302 115.67860 458877 5438358.40957 115.71321 458877 5438358.43301 115.75 458877 5438358.45315 115.78869 458877 5438358.46984 115.82898 458877 5438358.48296 115.87059 458877 5438358.49240 115.91317 458877 5438358.49809 115.95642 458877 5438358.5 116 458877 5438358.49809 116.04357 458877 5438358.49240 116.08682 458877 5438358.48296 116.12940 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="GML_be004b3f-664e-4531-937c-e1debb88ccaa">
                          <gml:posList srsDimension="3" count="5">458877 5438357.495 114.01 458877 5438357.495 112 458877 5438358.505 112 458877 5438358.505 114.01 458877 5438357.495 114.01 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="GML_3bc65987-d074-489f-af44-efd307921090">
                          <gml:posList srsDimension="3" count="5">458877 5438359.495 114 458877 5438359.495 112.8 458877 5438361.495 112.8 458877 5438361.495 114 458877 5438359.495 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="GML_8edecfaa-f525-48c8-a9e5-63608b9508a2">
                          <gml:posList srsDimension="3" count="5">458877 5438356.205 114 458877 5438354.205 114 458877 5438354.205 112.8 458877 5438356.205 112.8 458877 5438356.205 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_3d317f56-189c-44a0-bd8e-e4099d89bd74">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_7c82a40c-41d3-48de-920b-7a4431fd8cb8">
                          <gml:posList srsDimension="3" count="73">458877 5438358.40957 116.28678 458877 5438358.43301 116.25 458877 5438358.45315 116.21130 458877 5438358.46984 116.17101 458877 5438358.48296 116.12940 458877 5438358.49240 116.08682 458877 5438358.49809 116.04357 458877 5438358.5 116 458877 5438358.49809 115.95642 458877 5438358.49240 115.91317 458877 5438358.48296 115.87059 458877 5438358.46984 115.82898 458877 5438358.45315 115.78869 458877 5438358.43301 115.75 458877 5438358.40957 115.71321 458877 5438358.38302 115.67860 458877 5438358.35355 115.64644 458877 5438358.32139 115.61697 458877 5438358.28678 115.59042 458877 5438358.25 115.56698 458877 5438358.21130 115.54684 458877 5438358.17101 115.53015 458877 5438358.12940 115.51703 458877 5438358.08682 115.50759 458877 5438358.04357 115.50190 458877 5438358 115.5 458877 5438357.95642 115.50190 458877 5438357.91317 115.50759 458877 5438357.87059 115.51703 458877 5438357.82898 115.53015 458877 5438357.78869 115.54684 458877 5438357.75 115.56698 458877 5438357.71321 115.59042 458877 5438357.67860 115.61697 458877 5438357.64644 115.64644 458877 5438357.61697 115.67860 458877 5438357.59042 115.71321 458877 5438357.56698 115.75 458877 5438357.54684 115.78869 458877 5438357.53015 115.82898 458877 5438357.51703 115.87059 458877 5438357.50759 115.91317 458877 5438357.50190 115.95642 458877 5438357.5 116 458877 5438357.50190 116.04357 458877 5438357.50759 116.08682 458877 5438357.51703 116.12940 458877 5438357.53015 116.17101 458877 5438357.54684 116.21130 458877 5438357.56698 116.25 458877 5438357.59042 116.28678 458877 5438357.61697 116.32139 458877 5438357.64644 116.35355 458877 5438357.67860 116.38302 458877 5438357.71321 116.40957 458877 5438357.75 116.43301 458877 5438357.78869 116.45315 458877 5438357.82898 116.46984 458877 5438357.87059 116.48296 458877 5438357.91317 116.49240 458877 5438357.95642 116.49809 458877 5438358 116.5 458877 5438358.04357 116.49809 458877 5438358.08682 116.49240 458877 5438358.12940 116.48296 458877 5438358.17101 116.46984 458877 5438358.21130 116.45315 458877 5438358.25 116.43301 458877 5438358.28678 116.40957 458877 5438358.32139 116.38302 458877 5438358.35355 116.35355 458877 5438358.38302 116.32139 458877 5438358.40957 116.28678 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_df3a14b8-b4f7-4f67-a270-8670a2eb08e9">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_480f4802-1244-473c-8dee-6247f8569e2b">
                          <gml:posList srsDimension="3" count="5">458877 5438359.495 114 458877 5438361.495 114 458877 5438361.495 112.8 458877 5438359.495 112.8 458877 5438359.495 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_4753bdc4-f51e-4be8-aa26-98e899cb36e3">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_ee7da812-2c38-4ca4-adae-412178511e3c">
                          <gml:posList srsDimension="3" count="5">458877 5438357.495 114.01 458877 5438358.505 114.01 458877 5438358.505 112 458877 5438357.495 112 458877 5438357.495 114.01 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_d7a9658a-0f1c-4c5a-8d98-6968eb66dc87">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_7664c08f-5bd0-409c-bb1d-be2a932d4113">
                          <gml:posList srsDimension="3" count="5">458877 5438356.205 112.8 458877 5438354.205 112.8 458877 5438354.205 114 458877 5438356.205 114 458877 5438356.205 112.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </energy:surfaceGeometry>
              <energy:construction xlink:href="#GML_d2366771-6937-42fd-b25f-2f0cf586aa86" />
              <energy:contains>
                <energy:ThermalOpening gml:id="GML_6902cd4f-2031-4e2d-9f8c-bf54e57e8d99">
                  <gml:boundedBy>
                    <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                      <gml:lowerCorner>458877 5438357.5 115.5</gml:lowerCorner>
                      <gml:upperCorner>458877 5438358.5 116.5</gml:upperCorner>
                    </gml:Envelope>
                  </gml:boundedBy>
                  <energy:area uom="m2">0.78440168270290977</energy:area>
                  <energy:construction xlink:href="#GML_102fe10f-7faf-4c62-97ef-a6d858d9790d" />
                  <energy:surfaceGeometry>
                    <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_d0d52258-4b07-456d-9d26-a8157f0f650c">
                      <gml:surfaceMember>
                        <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_16a74da4-be69-4b48-a705-92bfa189955c">
                          <gml:exterior>
                            <gml:LinearRing gml:id="GML_01eca68b-f7d0-4366-9f06-6f6aa5f366a7">
                              <gml:posList srsDimension="3" count="73">458877 5438358.40957 116.28678 458877 5438358.43301 116.25 458877 5438358.45315 116.21130 458877 5438358.46984 116.17101 458877 5438358.48296 116.12940 458877 5438358.49240 116.08682 458877 5438358.49809 116.04357 458877 5438358.5 116 458877 5438358.49809 115.95642 458877 5438358.49240 115.91317 458877 5438358.48296 115.87059 458877 5438358.46984 115.82898 458877 5438358.45315 115.78869 458877 5438358.43301 115.75 458877 5438358.40957 115.71321 458877 5438358.38302 115.67860 458877 5438358.35355 115.64644 458877 5438358.32139 115.61697 458877 5438358.28678 115.59042 458877 5438358.25 115.56698 458877 5438358.21130 115.54684 458877 5438358.17101 115.53015 458877 5438358.12940 115.51703 458877 5438358.08682 115.50759 458877 5438358.04357 115.50190 458877 5438358 115.5 458877 5438357.95642 115.50190 458877 5438357.91317 115.50759 458877 5438357.87059 115.51703 458877 5438357.82898 115.53015 458877 5438357.78869 115.54684 458877 5438357.75 115.56698 458877 5438357.71321 115.59042 458877 5438357.67860 115.61697 458877 5438357.64644 115.64644 458877 5438357.61697 115.67860 458877 5438357.59042 115.71321 458877 5438357.56698 115.75 458877 5438357.54684 115.78869 458877 5438357.53015 115.82898 458877 5438357.51703 115.87059 458877 5438357.50759 115.91317 458877 5438357.50190 115.95642 458877 5438357.5 116 458877 5438357.50190 116.04357 458877 5438357.50759 116.08682 458877 5438357.51703 116.12940 458877 5438357.53015 116.17101 458877 5438357.54684 116.21130 458877 5438357.56698 116.25 458877 5438357.59042 116.28678 458877 5438357.61697 116.32139 458877 5438357.64644 116.35355 458877 5438357.67860 116.38302 458877 5438357.71321 116.40957 458877 5438357.75 116.43301 458877 5438357.78869 116.45315 458877 5438357.82898 116.46984 458877 5438357.87059 116.48296 458877 5438357.91317 116.49240 458877 5438357.95642 116.49809 458877 5438358 116.5 458877 5438358.04357 116.49809 458877 5438358.08682 116.49240 458877 5438358.12940 116.48296 458877 5438358.17101 116.46984 458877 5438358.21130 116.45315 458877 5438358.25 116.43301 458877 5438358.28678 116.40957 458877 5438358.32139 116.38302 458877 5438358.35355 116.35355 458877 5438358.38302 116.32139 458877 5438358.40957 116.28678 </gml:posList>
                            </gml:LinearRing>
                          </gml:exterior>
                        </gml:Polygon>
                      </gml:surfaceMember>
                    </gml:MultiSurface>
                  </energy:surfaceGeometry>
                </energy:ThermalOpening>
              </energy:contains>
              <energy:contains>
                <energy:ThermalOpening gml:id="GML_0e872bdb-1810-416d-ae78-a3fe84ef332c">
                  <gml:boundedBy>
                    <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                      <gml:lowerCorner>458877 5438359.495 112.8</gml:lowerCorner>
                      <gml:upperCorner>458877 5438361.495 114</gml:upperCorner>
                    </gml:Envelope>
                  </gml:boundedBy>
                  <energy:area uom="m2">2.4000000000000057</energy:area>
                  <energy:construction xlink:href="#GML_102fe10f-7faf-4c62-97ef-a6d858d9790d" />
                  <energy:surfaceGeometry>
                    <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_83248070-312d-41d7-89f3-a93c2aff223d">
                      <gml:surfaceMember>
                        <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_985ccabe-5d0b-4b04-a3d3-2021158f986b">
                          <gml:exterior>
                            <gml:LinearRing gml:id="GML_5d903658-6efd-4f21-9c52-943e8131a888">
                              <gml:posList srsDimension="3" count="5">458877 5438359.495 114 458877 5438361.495 114 458877 5438361.495 112.8 458877 5438359.495 112.8 458877 5438359.495 114 </gml:posList>
                            </gml:LinearRing>
                          </gml:exterior>
                        </gml:Polygon>
                      </gml:surfaceMember>
                    </gml:MultiSurface>
                  </energy:surfaceGeometry>
                </energy:ThermalOpening>
              </energy:contains>
              <energy:contains>
                <energy:ThermalOpening gml:id="GML_209bed8a-8464-47f6-a449-82818c12106b">
                  <gml:boundedBy>
                    <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                      <gml:lowerCorner>458877 5438354.205 112.8</gml:lowerCorner>
                      <gml:upperCorner>458877 5438356.205 114</gml:upperCorner>
                    </gml:Envelope>
                  </gml:boundedBy>
                  <energy:area uom="m2">2.4000000000000057</energy:area>
                  <energy:construction xlink:href="#GML_102fe10f-7faf-4c62-97ef-a6d858d9790d" />
                  <energy:surfaceGeometry>
                    <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_394f79c2-a441-4b16-be5f-1def3b47385f">
                      <gml:surfaceMember>
                        <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_6641fece-e0ac-4bbf-82d5-662dcde62f84">
                          <gml:exterior>
                            <gml:LinearRing gml:id="GML_7c5c84f4-8050-43e1-a7ab-c39cb5c9c0e6">
                              <gml:posList srsDimension="3" count="5">458877 5438356.205 112.8 458877 5438354.205 112.8 458877 5438354.205 114 458877 5438356.205 114 458877 5438356.205 112.8 </gml:posList>
                            </gml:LinearRing>
                          </gml:exterior>
                        </gml:Polygon>
                      </gml:surfaceMember>
                    </gml:MultiSurface>
                  </energy:surfaceGeometry>
                </energy:ThermalOpening>
              </energy:contains>
              <energy:contains>
                <energy:ThermalOpening gml:id="GML_adb88c5f-2648-4c97-8e37-a47cacbed8fc">
                  <gml:boundedBy>
                    <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                      <gml:lowerCorner>458877 5438357.495 112</gml:lowerCorner>
                      <gml:upperCorner>458877 5438358.505 114.01</gml:upperCorner>
                    </gml:Envelope>
                  </gml:boundedBy>
                  <energy:area uom="m2">2.0300999995507349</energy:area>
                  <energy:construction xlink:href="#GML_cc49d7fb-4a52-44d7-9154-a3bd931141d7" />
                  <energy:surfaceGeometry>
                    <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_8be61e25-c012-406e-932b-f043906f6f8e">
                      <gml:surfaceMember>
                        <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_31cc4caf-b742-4082-b16b-a19fd726717f">
                          <gml:exterior>
                            <gml:LinearRing gml:id="GML_d931cffd-ac60-4df4-962d-d90b28e211e6">
                              <gml:posList srsDimension="3" count="5">458877 5438357.495 114.01 458877 5438358.505 114.01 458877 5438358.505 112 458877 5438357.495 112 458877 5438357.495 114.01 </gml:posList>
                            </gml:LinearRing>
                          </gml:exterior>
                        </gml:Polygon>
                      </gml:surfaceMember>
                    </gml:MultiSurface>
                  </energy:surfaceGeometry>
                </energy:ThermalOpening>
              </energy:contains>
              <energy:delimits xlink:href="#GML_0d710724-1143-47e2-b824-0dadf29c1a84" />
            </energy:ThermalBoundary>
          </energy:boundedBy>
          <energy:boundedBy>
            <energy:ThermalBoundary gml:id="GML_be6e4a06-4945-4ca0-83b9-80c415d72113">
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458889 5438353 111.8</gml:lowerCorner>
                  <gml:upperCorner>458889 5438363 118.31769</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <energy:thermalBoundaryType>outerWall</energy:thermalBoundaryType>
              <energy:azimuth uom="deg">90</energy:azimuth>
              <energy:inclination uom="deg">90</energy:inclination>
              <energy:area uom="m2">50.743157806499184</energy:area>
              <energy:surfaceGeometry>
                <gml:MultiSurface gml:id="GML_3992d425-cd0d-48be-8ff9-2bc576becb62">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_d00f156a-7581-4d6a-a536-18b25ee9ac73">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_fec8ed02-949e-464f-ab98-d416bd00c9ab">
                          <gml:posList srsDimension="3" count="6">458889 5438358 118.31769 458889 5438353 115.43094 458889 5438353 111.8 458889 5438363 111.8 458889 5438363 115.43094 458889 5438358 118.31769 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                      <gml:interior>
                        <gml:LinearRing gml:id="GML_78d2884a-b692-4fdb-bfd0-8eed512b811c">
                          <gml:posList srsDimension="3" count="73">458889 5438357.51703 116.12940 458889 5438357.53015 116.17101 458889 5438357.54684 116.21130 458889 5438357.56698 116.25 458889 5438357.59042 116.28678 458889 5438357.61697 116.32139 458889 5438357.64644 116.35355 458889 5438357.67860 116.38302 458889 5438357.71321 116.40957 458889 5438357.75 116.43301 458889 5438357.78869 116.45315 458889 5438357.82898 116.46984 458889 5438357.87059 116.48296 458889 5438357.91317 116.49240 458889 5438357.95642 116.49809 458889 5438358 116.5 458889 5438358.04357 116.49809 458889 5438358.08682 116.49240 458889 5438358.12940 116.48296 458889 5438358.17101 116.46984 458889 5438358.21130 116.45315 458889 5438358.25 116.43301 458889 5438358.28678 116.40957 458889 5438358.32139 116.38302 458889 5438358.35355 116.35355 458889 5438358.38302 116.32139 458889 5438358.40957 116.28678 458889 5438358.43301 116.25 458889 5438358.45315 116.21130 458889 5438358.46984 116.17101 458889 5438358.48296 116.12940 458889 5438358.49240 116.08682 458889 5438358.49809 116.04357 458889 5438358.5 116 458889 5438358.49809 115.95642 458889 5438358.49240 115.91317 458889 5438358.48296 115.87059 458889 5438358.46984 115.82898 458889 5438358.45315 115.78869 458889 5438358.43301 115.75 458889 5438358.40957 115.71321 458889 5438358.38302 115.67860 458889 5438358.35355 115.64644 458889 5438358.32139 115.61697 458889 5438358.28678 115.59042 458889 5438358.25 115.56698 458889 5438358.21130 115.54684 458889 5438358.17101 115.53015 458889 5438358.12940 115.51703 458889 5438358.08682 115.50759 458889 5438358.04357 115.50190 458889 5438358 115.5 458889 5438357.95642 115.50190 458889 5438357.91317 115.50759 458889 5438357.87059 115.51703 458889 5438357.82898 115.53015 458889 5438357.78869 115.54684 458889 5438357.75 115.56698 458889 5438357.71321 115.59042 458889 5438357.67860 115.61697 458889 5438357.64644 115.64644 458889 5438357.61697 115.67860 458889 5438357.59042 115.71321 458889 5438357.56698 115.75 458889 5438357.54684 115.78869 458889 5438357.53015 115.82898 458889 5438357.51703 115.87059 458889 5438357.50759 115.91317 458889 5438357.50190 115.95642 458889 5438357.5 116 458889 5438357.50190 116.04357 458889 5438357.50759 116.08682 458889 5438357.51703 116.12940 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="GML_8cc24435-69f9-4549-835a-b92b4a7ed71e">
                          <gml:posList srsDimension="3" count="5">458889 5438361.50239 114 458889 5438361.50239 112.8 458889 5438359.50239 112.8 458889 5438359.50239 114 458889 5438361.50239 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="GML_29ae4342-b396-46c8-99c0-8a07e7d1f3d9">
                          <gml:posList srsDimension="3" count="5">458889 5438354.205 112.8 458889 5438354.205 114 458889 5438356.205 114 458889 5438356.205 112.8 458889 5438354.205 112.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_c8bbb22f-12fd-4c0e-bdba-607c9d249dd6">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_dc87d81a-c1af-4d55-a978-51602521ae53">
                          <gml:posList srsDimension="3" count="5">458889 5438356.205 112.8 458889 5438356.205 114 458889 5438354.205 114 458889 5438354.205 112.8 458889 5438356.205 112.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_f40dac21-6be6-4b2e-90c1-b9a26f97c20e">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_b7a38cd4-700d-4f12-b176-2b19d99e27ea">
                          <gml:posList srsDimension="3" count="5">458889 5438361.50239 114 458889 5438359.50239 114 458889 5438359.50239 112.8 458889 5438361.50239 112.8 458889 5438361.50239 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_54fd00c0-fd6c-41d5-a359-55580d4d17f9">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_285c59da-c253-4b95-af09-c03678baa2de">
                          <gml:posList srsDimension="3" count="73">458889 5438357.61697 116.32139 458889 5438357.59042 116.28678 458889 5438357.56698 116.25 458889 5438357.54684 116.21130 458889 5438357.53015 116.17101 458889 5438357.51703 116.12940 458889 5438357.50759 116.08682 458889 5438357.50190 116.04357 458889 5438357.5 116 458889 5438357.50190 115.95642 458889 5438357.50759 115.91317 458889 5438357.51703 115.87059 458889 5438357.53015 115.82898 458889 5438357.54684 115.78869 458889 5438357.56698 115.75 458889 5438357.59042 115.71321 458889 5438357.61697 115.67860 458889 5438357.64644 115.64644 458889 5438357.67860 115.61697 458889 5438357.71321 115.59042 458889 5438357.75 115.56698 458889 5438357.78869 115.54684 458889 5438357.82898 115.53015 458889 5438357.87059 115.51703 458889 5438357.91317 115.50759 458889 5438357.95642 115.50190 458889 5438358 115.5 458889 5438358.04357 115.50190 458889 5438358.08682 115.50759 458889 5438358.12940 115.51703 458889 5438358.17101 115.53015 458889 5438358.21130 115.54684 458889 5438358.25 115.56698 458889 5438358.28678 115.59042 458889 5438358.32139 115.61697 458889 5438358.35355 115.64644 458889 5438358.38302 115.67860 458889 5438358.40957 115.71321 458889 5438358.43301 115.75 458889 5438358.45315 115.78869 458889 5438358.46984 115.82898 458889 5438358.48296 115.87059 458889 5438358.49240 115.91317 458889 5438358.49809 115.95642 458889 5438358.5 116 458889 5438358.49809 116.04357 458889 5438358.49240 116.08682 458889 5438358.48296 116.12940 458889 5438358.46984 116.17101 458889 5438358.45315 116.21130 458889 5438358.43301 116.25 458889 5438358.40957 116.28678 458889 5438358.38302 116.32139 458889 5438358.35355 116.35355 458889 5438358.32139 116.38302 458889 5438358.28678 116.40957 458889 5438358.25 116.43301 458889 5438358.21130 116.45315 458889 5438358.17101 116.46984 458889 5438358.12940 116.48296 458889 5438358.08682 116.49240 458889 5438358.04357 116.49809 458889 5438358 116.5 458889 5438357.95642 116.49809 458889 5438357.91317 116.49240 458889 5438357.87059 116.48296 458889 5438357.82898 116.46984 458889 5438357.78869 116.45315 458889 5438357.75 116.43301 458889 5438357.71321 116.40957 458889 5438357.67860 116.38302 458889 5438357.64644 116.35355 458889 5438357.61697 116.32139 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </energy:surfaceGeometry>
              <energy:construction xlink:href="#GML_d2366771-6937-42fd-b25f-2f0cf586aa86" />
              <energy:contains>
                <energy:ThermalOpening gml:id="GML_0c5fa7e7-a32d-4ce5-9b22-1e8f51b134cc">
                  <gml:boundedBy>
                    <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                      <gml:lowerCorner>458889 5438354.205 112.8</gml:lowerCorner>
                      <gml:upperCorner>458889 5438356.205 114</gml:upperCorner>
                    </gml:Envelope>
                  </gml:boundedBy>
                  <energy:area uom="m2">2.4000000000000057</energy:area>
                  <energy:construction xlink:href="#GML_102fe10f-7faf-4c62-97ef-a6d858d9790d" />
                  <energy:surfaceGeometry>
                    <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_6deaf52b-77d8-4d59-98d8-030e00b5c9b6">
                      <gml:surfaceMember>
                        <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_cb6c3a40-e3aa-47dd-80cb-e62b96c8f7e2">
                          <gml:exterior>
                            <gml:LinearRing gml:id="GML_ef68056a-5ec3-4328-aded-9b497c7621b7">
                              <gml:posList srsDimension="3" count="5">458889 5438356.205 112.8 458889 5438356.205 114 458889 5438354.205 114 458889 5438354.205 112.8 458889 5438356.205 112.8 </gml:posList>
                            </gml:LinearRing>
                          </gml:exterior>
                        </gml:Polygon>
                      </gml:surfaceMember>
                    </gml:MultiSurface>
                  </energy:surfaceGeometry>
                </energy:ThermalOpening>
              </energy:contains>
              <energy:contains>
                <energy:ThermalOpening gml:id="GML_5a893e52-e004-47e3-8534-d113f9afa625">
                  <gml:boundedBy>
                    <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                      <gml:lowerCorner>458889 5438359.50239 112.8</gml:lowerCorner>
                      <gml:upperCorner>458889 5438361.50239 114</gml:upperCorner>
                    </gml:Envelope>
                  </gml:boundedBy>
                  <energy:area uom="m2">2.4000000000000057</energy:area>
                  <energy:construction xlink:href="#GML_102fe10f-7faf-4c62-97ef-a6d858d9790d" />
                  <energy:surfaceGeometry>
                    <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_8377e80b-95bb-408a-be15-35a089c95d51">
                      <gml:surfaceMember>
                        <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_78e5f570-7a54-4405-99cb-743fef8390f4">
                          <gml:exterior>
                            <gml:LinearRing gml:id="GML_37a742fb-b93b-45bb-b0f0-e5faeeb6c304">
                              <gml:posList srsDimension="3" count="5">458889 5438361.50239 114 458889 5438359.50239 114 458889 5438359.50239 112.8 458889 5438361.50239 112.8 458889 5438361.50239 114 </gml:posList>
                            </gml:LinearRing>
                          </gml:exterior>
                        </gml:Polygon>
                      </gml:surfaceMember>
                    </gml:MultiSurface>
                  </energy:surfaceGeometry>
                </energy:ThermalOpening>
              </energy:contains>
              <energy:contains>
                <energy:ThermalOpening gml:id="GML_d741101c-2af6-4aba-aab9-36a55a7a9d79">
                  <gml:boundedBy>
                    <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                      <gml:lowerCorner>458889 5438357.5 115.5</gml:lowerCorner>
                      <gml:upperCorner>458889 5438358.5 116.5</gml:upperCorner>
                    </gml:Envelope>
                  </gml:boundedBy>
                  <energy:area uom="m2">0.78440168270290989</energy:area>
                  <energy:construction xlink:href="#GML_102fe10f-7faf-4c62-97ef-a6d858d9790d" />
                  <energy:surfaceGeometry>
                    <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_13545ec8-a03e-44d5-b5c4-2e6126a40476">
                      <gml:surfaceMember>
                        <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_5fea7775-9dc2-46dd-8e04-2a8f15c473c7">
                          <gml:exterior>
                            <gml:LinearRing gml:id="GML_9dde2967-d227-4576-a02c-e454d17fa7c5">
                              <gml:posList srsDimension="3" count="73">458889 5438357.61697 116.32139 458889 5438357.59042 116.28678 458889 5438357.56698 116.25 458889 5438357.54684 116.21130 458889 5438357.53015 116.17101 458889 5438357.51703 116.12940 458889 5438357.50759 116.08682 458889 5438357.50190 116.04357 458889 5438357.5 116 458889 5438357.50190 115.95642 458889 5438357.50759 115.91317 458889 5438357.51703 115.87059 458889 5438357.53015 115.82898 458889 5438357.54684 115.78869 458889 5438357.56698 115.75 458889 5438357.59042 115.71321 458889 5438357.61697 115.67860 458889 5438357.64644 115.64644 458889 5438357.67860 115.61697 458889 5438357.71321 115.59042 458889 5438357.75 115.56698 458889 5438357.78869 115.54684 458889 5438357.82898 115.53015 458889 5438357.87059 115.51703 458889 5438357.91317 115.50759 458889 5438357.95642 115.50190 458889 5438358 115.5 458889 5438358.04357 115.50190 458889 5438358.08682 115.50759 458889 5438358.12940 115.51703 458889 5438358.17101 115.53015 458889 5438358.21130 115.54684 458889 5438358.25 115.56698 458889 5438358.28678 115.59042 458889 5438358.32139 115.61697 458889 5438358.35355 115.64644 458889 5438358.38302 115.67860 458889 5438358.40957 115.71321 458889 5438358.43301 115.75 458889 5438358.45315 115.78869 458889 5438358.46984 115.82898 458889 5438358.48296 115.87059 458889 5438358.49240 115.91317 458889 5438358.49809 115.95642 458889 5438358.5 116 458889 5438358.49809 116.04357 458889 5438358.49240 116.08682 458889 5438358.48296 116.12940 458889 5438358.46984 116.17101 458889 5438358.45315 116.21130 458889 5438358.43301 116.25 458889 5438358.40957 116.28678 458889 5438358.38302 116.32139 458889 5438358.35355 116.35355 458889 5438358.32139 116.38302 458889 5438358.28678 116.40957 458889 5438358.25 116.43301 458889 5438358.21130 116.45315 458889 5438358.17101 116.46984 458889 5438358.12940 116.48296 458889 5438358.08682 116.49240 458889 5438358.04357 116.49809 458889 5438358 116.5 458889 5438357.95642 116.49809 458889 5438357.91317 116.49240 458889 5438357.87059 116.48296 458889 5438357.82898 116.46984 458889 5438357.78869 116.45315 458889 5438357.75 116.43301 458889 5438357.71321 116.40957 458889 5438357.67860 116.38302 458889 5438357.64644 116.35355 458889 5438357.61697 116.32139 </gml:posList>
                            </gml:LinearRing>
                          </gml:exterior>
                        </gml:Polygon>
                      </gml:surfaceMember>
                    </gml:MultiSurface>
                  </energy:surfaceGeometry>
                </energy:ThermalOpening>
              </energy:contains>
              <energy:delimits xlink:href="#GML_0d710724-1143-47e2-b824-0dadf29c1a84" />
            </energy:ThermalBoundary>
          </energy:boundedBy>
          <energy:boundedBy>
            <energy:ThermalBoundary gml:id="GML_93fce7a0-6e85-4fa9-a719-52126163ce84">
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458877 5438353 111.8</gml:lowerCorner>
                  <gml:upperCorner>458889 5438353 115.43094</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <energy:thermalBoundaryType>outerWall</energy:thermalBoundaryType>
              <energy:azimuth uom="deg">180</energy:azimuth>
              <energy:inclination uom="deg">90</energy:inclination>
              <energy:area uom="m2">43.571281292110257</energy:area>
              <energy:surfaceGeometry>
                <gml:MultiSurface gml:id="GML_d9e6f096-b092-4053-8829-4c97589fa8ea">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_2bbcb323-f4bc-44d6-a761-46e762bdd1bf">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_11cc1648-2451-4192-b501-b893465fcc76">
                          <gml:posList srsDimension="3" count="5">458889 5438353 115.43094 458877 5438353 115.43094 458877 5438353 111.8 458889 5438353 111.8 458889 5438353 115.43094 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                      <gml:interior>
                        <gml:LinearRing gml:id="GML_66f580ad-d011-43ba-b1f8-ba085ec2f2d0">
                          <gml:posList srsDimension="3" count="5">458884.005 5438353 114.375 458884.005 5438353 112 458881.995 5438353 112 458881.995 5438353 114.375 458884.005 5438353 114.375 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="GML_56b89ef3-97ee-4d3c-ae24-fb005c39e77f">
                          <gml:posList srsDimension="3" count="5">458885.21 5438353 114 458887.21 5438353 114 458887.21 5438353 112.8 458885.21 5438353 112.8 458885.21 5438353 114 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                      <gml:interior>
                        <gml:LinearRing gml:id="GML_7b5faab9-4222-4c67-ad30-502a09badbd2">
                          <gml:posList srsDimension="3" count="5">458880.79 5438353 112.8 458878.79 5438353 112.8 458878.79 5438353 114 458880.79 5438353 114 458880.79 5438353 112.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:interior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_427014fe-3735-4197-aab6-78c425c770e1">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_29d4891d-03db-4b45-9787-5a10f7fd564c">
                          <gml:posList srsDimension="3" count="5">458887.21 5438353 112.8 458887.21 5438353 114 458885.21 5438353 114 458885.21 5438353 112.8 458887.21 5438353 112.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_2d13f740-5968-496f-b209-e8cc3d6b3dfe">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_08414379-d0e7-4474-a0b1-509dd0f9b1ea">
                          <gml:posList srsDimension="3" count="5">458878.79 5438353 112.8 458880.79 5438353 112.8 458880.79 5438353 114 458878.79 5438353 114 458878.79 5438353 112.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_c81b32b3-83f7-480c-a405-9db37c4dbca6">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_a131df50-448b-4512-bc03-e20639f1d0df">
                          <gml:posList srsDimension="3" count="5">458884.005 5438353 112 458884.005 5438353 114.375 458881.995 5438353 114.375 458881.995 5438353 112 458884.005 5438353 112 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </energy:surfaceGeometry>
              <energy:construction xlink:href="#GML_d2366771-6937-42fd-b25f-2f0cf586aa86" />
              <energy:contains>
                <energy:ThermalOpening gml:id="GML_cc05d8f5-7ba5-4bba-9476-ef8ea8f98780">
                  <gml:boundedBy>
                    <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                      <gml:lowerCorner>458885.21 5438353 112.8</gml:lowerCorner>
                      <gml:upperCorner>458887.21 5438353 114</gml:upperCorner>
                    </gml:Envelope>
                  </gml:boundedBy>
                  <energy:area uom="m2">2.4000000000000057</energy:area>
                  <energy:construction xlink:href="#GML_102fe10f-7faf-4c62-97ef-a6d858d9790d" />
                  <energy:surfaceGeometry>
                    <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_78cb1049-b4d7-4104-b7ed-c2a2eb360175">
                      <gml:surfaceMember>
                        <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_488be186-771c-4642-9eca-49d6cd2d84f8">
                          <gml:exterior>
                            <gml:LinearRing gml:id="GML_3bc9e16f-8ff9-4eb5-9f76-731970e33091">
                              <gml:posList srsDimension="3" count="5">458887.21 5438353 112.8 458887.21 5438353 114 458885.21 5438353 114 458885.21 5438353 112.8 458887.21 5438353 112.8 </gml:posList>
                            </gml:LinearRing>
                          </gml:exterior>
                        </gml:Polygon>
                      </gml:surfaceMember>
                    </gml:MultiSurface>
                  </energy:surfaceGeometry>
                </energy:ThermalOpening>
              </energy:contains>
              <energy:contains>
                <energy:ThermalOpening gml:id="GML_57b4cbc0-a9d1-4114-b7fd-f6499350a4cb">
                  <gml:boundedBy>
                    <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                      <gml:lowerCorner>458878.79 5438353 112.8</gml:lowerCorner>
                      <gml:upperCorner>458880.79 5438353 114</gml:upperCorner>
                    </gml:Envelope>
                  </gml:boundedBy>
                  <energy:area uom="m2">2.4000000000000057</energy:area>
                  <energy:construction xlink:href="#GML_102fe10f-7faf-4c62-97ef-a6d858d9790d" />
                  <energy:surfaceGeometry>
                    <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_d2828c5f-830f-4ba1-a9ab-0bd008849299">
                      <gml:surfaceMember>
                        <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_f4d9ec58-1612-404e-87c7-f4218cd8a16e">
                          <gml:exterior>
                            <gml:LinearRing gml:id="GML_f0ed1771-ad1d-41d6-916b-776484313778">
                              <gml:posList srsDimension="3" count="5">458878.79 5438353 112.8 458880.79 5438353 112.8 458880.79 5438353 114 458878.79 5438353 114 458878.79 5438353 112.8 </gml:posList>
                            </gml:LinearRing>
                          </gml:exterior>
                        </gml:Polygon>
                      </gml:surfaceMember>
                    </gml:MultiSurface>
                  </energy:surfaceGeometry>
                </energy:ThermalOpening>
              </energy:contains>
              <energy:contains>
                <energy:ThermalOpening gml:id="GML_3f8babd2-4768-491b-a412-53cc2a04a742">
                  <gml:boundedBy>
                    <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                      <gml:lowerCorner>458881.995 5438353 112</gml:lowerCorner>
                      <gml:upperCorner>458884.005 5438353 114.375</gml:upperCorner>
                    </gml:Envelope>
                  </gml:boundedBy>
                  <energy:area uom="m2">4.7737500000221189</energy:area>
                  <energy:construction xlink:href="#GML_cc49d7fb-4a52-44d7-9154-a3bd931141d7" />
                  <energy:surfaceGeometry>
                    <gml:MultiSurface srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_6d0ba275-4350-4dac-8f52-e9d977b95d31">
                      <gml:surfaceMember>
                        <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_f31c352c-1117-4cfb-93d0-e020d327451e">
                          <gml:exterior>
                            <gml:LinearRing gml:id="GML_79e3c7ea-46a5-45cc-a969-aca9b284cf59">
                              <gml:posList srsDimension="3" count="5">458884.005 5438353 112 458884.005 5438353 114.375 458881.995 5438353 114.375 458881.995 5438353 112 458884.005 5438353 112 </gml:posList>
                            </gml:LinearRing>
                          </gml:exterior>
                        </gml:Polygon>
                      </gml:surfaceMember>
                    </gml:MultiSurface>
                  </energy:surfaceGeometry>
                </energy:ThermalOpening>
              </energy:contains>
              <energy:delimits xlink:href="#GML_0d710724-1143-47e2-b824-0dadf29c1a84" />
            </energy:ThermalBoundary>
          </energy:boundedBy>
          <energy:boundedBy>
            <energy:ThermalBoundary gml:id="GML_59107a6e-635d-4644-9215-167ce4bff596">
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458877 5438358 115.43094</gml:lowerCorner>
                  <gml:upperCorner>458889 5438363 118.31769</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <energy:thermalBoundaryType>roof</energy:thermalBoundaryType>
              <energy:azimuth uom="deg">0</energy:azimuth>
              <energy:inclination uom="deg">29.999999999999947</energy:inclination>
              <energy:area uom="m2">69.282032288610935</energy:area>
              <energy:surfaceGeometry>
                <gml:MultiSurface gml:id="GML_6c6d6743-95dc-4230-b652-e45d0e87c058">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_69b7a186-bc23-44bc-b525-3e7c43817aea">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_9fd17923-7e8d-4adc-acf4-72742b1a2f18">
                          <gml:posList srsDimension="3" count="5">458877 5438358 118.31769 458889 5438358 118.31769 458889 5438363 115.43094 458877 5438363 115.43094 458877 5438358 118.31769 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </energy:surfaceGeometry>
              <energy:construction xlink:href="#GML_e01266a9-b188-453c-abd4-23151e98f470" />
              <energy:delimits xlink:href="#GML_0d710724-1143-47e2-b824-0dadf29c1a84" />
            </energy:ThermalBoundary>
          </energy:boundedBy>
          <energy:boundedBy>
            <energy:ThermalBoundary gml:id="GML_66a66ab1-9125-49cf-acca-cd7fece8145d">
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458877 5438353 115.43094</gml:lowerCorner>
                  <gml:upperCorner>458889 5438358 118.31769</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <energy:thermalBoundaryType>roof</energy:thermalBoundaryType>
              <energy:azimuth uom="deg">180</energy:azimuth>
              <energy:inclination uom="deg">29.999999999999947</energy:inclination>
              <energy:area uom="m2">69.282032288610935</energy:area>
              <energy:surfaceGeometry>
                <gml:MultiSurface gml:id="GML_7f354910-7fb1-44aa-8c25-82951c6886c4">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_1f35f63a-2b84-4ca0-bf94-04a9deb0f7e3">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_46bec8fc-0e9b-47bd-a6e4-069cf5112ce9">
                          <gml:posList srsDimension="3" count="5">458889 5438353 115.43094 458889 5438358 118.31769 458877 5438358 118.31769 458877 5438353 115.43094 458889 5438353 115.43094 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </energy:surfaceGeometry>
              <energy:construction xlink:href="#GML_e01266a9-b188-453c-abd4-23151e98f470" />
              <energy:delimits xlink:href="#GML_0d710724-1143-47e2-b824-0dadf29c1a84" />
            </energy:ThermalBoundary>
          </energy:boundedBy>
          <energy:boundedBy>
            <energy:ThermalBoundary gml:id="GML_b6c598b6-b239-4fab-8243-9997fbeeb083">
              <gml:boundedBy>
                <gml:Envelope srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH">
                  <gml:lowerCorner>458877 5438353 111.8</gml:lowerCorner>
                  <gml:upperCorner>458889 5438363 111.8</gml:upperCorner>
                </gml:Envelope>
              </gml:boundedBy>
              <energy:thermalBoundaryType>groundSlab</energy:thermalBoundaryType>
              <energy:azimuth uom="deg">0</energy:azimuth>
              <energy:inclination uom="deg">180</energy:inclination>
              <energy:area uom="m2">120</energy:area>
              <energy:surfaceGeometry>
                <gml:MultiSurface gml:id="GML_66bef686-d111-40a7-8ee7-0eaa28517072">
                  <gml:surfaceMember>
                    <gml:Polygon srsName="urn:adv:crs:ETRS89_UTM32*DE_DHHN92_NH" gml:id="GML_90b40e8f-a72f-4488-b6b0-11ec680744cd">
                      <gml:exterior>
                        <gml:LinearRing gml:id="GML_f2e0ae56-aeee-4552-aa78-f5e4c43c9bee">
                          <gml:posList srsDimension="3" count="5">458889 5438353 111.8 458877 5438353 111.8 458877 5438363 111.8 458889 5438363 111.8 458889 5438353 111.8 </gml:posList>
                        </gml:LinearRing>
                      </gml:exterior>
                    </gml:Polygon>
                  </gml:surfaceMember>
                </gml:MultiSurface>
              </energy:surfaceGeometry>
              <energy:construction xlink:href="#GML_f5a37e1c-bf2b-42e0-8c85-6f269d0c51f6" />
              <energy:delimits xlink:href="#GML_0d710724-1143-47e2-b824-0dadf29c1a84" />
            </energy:ThermalBoundary>
          </energy:boundedBy>
        </energy:ThermalZone>
      </energy:thermalZone>
      <energy:usageZone>
        <energy:UsageZone gml:id="GML_f7f94cac-3601-4c1d-a9ed-868ecdd42ea4">
          <energy:heatingSchedule>
            <energy:DailyPatternSchedule gml:id="GML_b9af7a50-5a31-4305-9e30-a4dc9f08ffcd">
              <gml:name>KIT-FZK-Haus-Heizung</gml:name>
              <energy:periodOfYear>
                <energy:PeriodOfYear>
                  <energy:period>
                    <gml:TimePeriod>
                      <gml:beginPosition>2022-01-01T00:00:00</gml:beginPosition>
                      <gml:endPosition>2022-12-31T00:00:00</gml:endPosition>
                    </gml:TimePeriod>
                  </energy:period>
                  <energy:dailySchedule>
                    <energy:DailySchedule>
                      <energy:dayType>weekDay</energy:dayType>
                      <energy:schedule>
                        <energy:RegularTimeSeries>
                          <energy:variableProperties>
                            <energy:TimeValuesProperties>
                              <energy:acquisitionMethod>estimation</energy:acquisitionMethod>
                              <energy:interpolationType>averageInSucceedingInterval</energy:interpolationType>
                              <energy:thematicDescription>Nominal temperature heating</energy:thematicDescription>
                            </energy:TimeValuesProperties>
                          </energy:variableProperties>
                          <energy:temporalExtent>
                            <gml:TimePeriod>
                              <gml:beginPosition>00:00:00</gml:beginPosition>
                              <gml:endPosition>00:00:23</gml:endPosition>
                            </gml:TimePeriod>
                          </energy:temporalExtent>
                          <energy:timeInterval unit="hour">1</energy:timeInterval>
                          <energy:values uom="C">20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 
20 20 20 </energy:values>
                        </energy:RegularTimeSeries>
                      </energy:schedule>
                    </energy:DailySchedule>
                  </energy:dailySchedule>
                  <energy:dailySchedule>
                    <energy:DailySchedule>
                      <energy:dayType>weekEnd</energy:dayType>
                      <energy:schedule>
                        <energy:RegularTimeSeries>
                          <energy:variableProperties>
                            <energy:TimeValuesProperties>
                              <energy:acquisitionMethod>estimation</energy:acquisitionMethod>
                              <energy:interpolationType>averageInSucceedingInterval</energy:interpolationType>
                              <energy:thematicDescription>Nominal temperature heating</energy:thematicDescription>
                            </energy:TimeValuesProperties>
                          </energy:variableProperties>
                          <energy:temporalExtent>
                            <gml:TimePeriod>
                              <gml:beginPosition>00:00:00</gml:beginPosition>
                              <gml:endPosition>00:00:23</gml:endPosition>
                            </gml:TimePeriod>
                          </energy:temporalExtent>
                          <energy:timeInterval unit="hour">1</energy:timeInterval>
                          <energy:values uom="C">20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 
20 20 20 </energy:values>
                        </energy:RegularTimeSeries>
                      </energy:schedule>
                    </energy:DailySchedule>
                  </energy:dailySchedule>
                </energy:PeriodOfYear>
              </energy:periodOfYear>
            </energy:DailyPatternSchedule>
          </energy:heatingSchedule>
          <energy:usageZoneType codeSpace="http://hub.geosmartcity.eu/registry/codelist/CurrentUseValue/">office</energy:usageZoneType>
          <energy:ventilationSchedule>
            <energy:DailyPatternSchedule gml:id="GML_47e4f8e2-28dd-4efb-977e-ff618aa4b70b">
              <gml:name>KIT-FZK-Haus-Lueftung</gml:name>
              <energy:periodOfYear>
                <energy:PeriodOfYear>
                  <energy:period>
                    <gml:TimePeriod>
                      <gml:beginPosition>2022-01-01T00:00:00</gml:beginPosition>
                      <gml:endPosition>2022-12-31T00:00:00</gml:endPosition>
                    </gml:TimePeriod>
                  </energy:period>
                  <energy:dailySchedule>
                    <energy:DailySchedule>
                      <energy:dayType>weekDay</energy:dayType>
                      <energy:schedule>
                        <energy:RegularTimeSeries>
                          <energy:variableProperties>
                            <energy:TimeValuesProperties>
                              <energy:acquisitionMethod>estimation</energy:acquisitionMethod>
                              <energy:interpolationType>averageInSucceedingInterval</energy:interpolationType>
                              <energy:thematicDescription>Nominal ventilation flow rate</energy:thematicDescription>
                            </energy:TimeValuesProperties>
                          </energy:variableProperties>
                          <energy:temporalExtent>
                            <gml:TimePeriod>
                              <gml:beginPosition>00:00:00</gml:beginPosition>
                              <gml:endPosition>00:00:23</gml:endPosition>
                            </gml:TimePeriod>
                          </energy:temporalExtent>
                          <energy:timeInterval unit="hour">1</energy:timeInterval>
                          <energy:values uom="1/h">0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 
0.8 0.8 0.8 </energy:values>
                        </energy:RegularTimeSeries>
                      </energy:schedule>
                    </energy:DailySchedule>
                  </energy:dailySchedule>
                  <energy:dailySchedule>
                    <energy:DailySchedule>
                      <energy:dayType>weekEnd</energy:dayType>
                      <energy:schedule>
                        <energy:RegularTimeSeries>
                          <energy:variableProperties>
                            <energy:TimeValuesProperties>
                              <energy:acquisitionMethod>estimation</energy:acquisitionMethod>
                              <energy:interpolationType>averageInSucceedingInterval</energy:interpolationType>
                              <energy:thematicDescription>Nominal ventilation flow rate</energy:thematicDescription>
                            </energy:TimeValuesProperties>
                          </energy:variableProperties>
                          <energy:temporalExtent>
                            <gml:TimePeriod>
                              <gml:beginPosition>00:00:00</gml:beginPosition>
                              <gml:endPosition>00:00:23</gml:endPosition>
                            </gml:TimePeriod>
                          </energy:temporalExtent>
                          <energy:timeInterval unit="hour">1</energy:timeInterval>
                          <energy:values uom="1/h">0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 
0.8 0.8 0.8 </energy:values>
                        </energy:RegularTimeSeries>
                      </energy:schedule>
                    </energy:DailySchedule>
                  </energy:dailySchedule>
                </energy:PeriodOfYear>
              </energy:periodOfYear>
            </energy:DailyPatternSchedule>
          </energy:ventilationSchedule>
          <energy:occupiedBy>
            <energy:Occupants gml:id="GML_c4a6f1b3-af34-46db-9180-deff7708e6be">
              <energy:heatDissipation>
                <energy:HeatExchangeType>
                  <energy:convectiveFraction uom="scale">0.5</energy:convectiveFraction>
                  <energy:radiantFraction uom="scale">0.5</energy:radiantFraction>
                  <energy:totalValue uom="W">82</energy:totalValue>
                </energy:HeatExchangeType>
              </energy:heatDissipation>
              <energy:numberOfOccupants>2</energy:numberOfOccupants>
              <energy:occupancyRate>
                <energy:DailyPatternSchedule gml:id="GML_5024037a-d3e1-4041-a60c-2fa9fceb962f">
                  <gml:name>KIT-FZK-Haus-Personen</gml:name>
                  <energy:periodOfYear>
                    <energy:PeriodOfYear>
                      <energy:period>
                        <gml:TimePeriod>
                          <gml:beginPosition>2022-01-01T00:00:00</gml:beginPosition>
                          <gml:endPosition>2022-12-31T00:00:00</gml:endPosition>
                        </gml:TimePeriod>
                      </energy:period>
                      <energy:dailySchedule>
                        <energy:DailySchedule>
                          <energy:dayType>weekDay</energy:dayType>
                          <energy:schedule>
                            <energy:RegularTimeSeries>
                              <energy:variableProperties>
                                <energy:TimeValuesProperties>
                                  <energy:acquisitionMethod>estimation</energy:acquisitionMethod>
                                  <energy:interpolationType>averageInSucceedingInterval</energy:interpolationType>
                                  <energy:thematicDescription>Presence of occupants</energy:thematicDescription>
                                </energy:TimeValuesProperties>
                              </energy:variableProperties>
                              <energy:temporalExtent>
                                <gml:TimePeriod>
                                  <gml:beginPosition>00:00:00</gml:beginPosition>
                                  <gml:endPosition>00:00:23</gml:endPosition>
                                </gml:TimePeriod>
                              </energy:temporalExtent>
                              <energy:timeInterval unit="hour">1</energy:timeInterval>
                              <energy:values uom="scale">0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 
0.8 0.8 0.8 </energy:values>
                            </energy:RegularTimeSeries>
                          </energy:schedule>
                        </energy:DailySchedule>
                      </energy:dailySchedule>
                      <energy:dailySchedule>
                        <energy:DailySchedule>
                          <energy:dayType>weekEnd</energy:dayType>
                          <energy:schedule>
                            <energy:RegularTimeSeries>
                              <energy:variableProperties>
                                <energy:TimeValuesProperties>
                                  <energy:acquisitionMethod>estimation</energy:acquisitionMethod>
                                  <energy:interpolationType>averageInSucceedingInterval</energy:interpolationType>
                                  <energy:thematicDescription>Presence of occupants</energy:thematicDescription>
                                </energy:TimeValuesProperties>
                              </energy:variableProperties>
                              <energy:temporalExtent>
                                <gml:TimePeriod>
                                  <gml:beginPosition>00:00:00</gml:beginPosition>
                                  <gml:endPosition>00:00:23</gml:endPosition>
                                </gml:TimePeriod>
                              </energy:temporalExtent>
                              <energy:timeInterval unit="hour">1</energy:timeInterval>
                              <energy:values uom="scale">0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 0.8 
0.8 0.8 0.8 </energy:values>
                            </energy:RegularTimeSeries>
                          </energy:schedule>
                        </energy:DailySchedule>
                      </energy:dailySchedule>
                    </energy:PeriodOfYear>
                  </energy:periodOfYear>
                </energy:DailyPatternSchedule>
              </energy:occupancyRate>
            </energy:Occupants>
          </energy:occupiedBy>
          <energy:equippedWith>
            <energy:ElectricalAppliances gml:id="GML_b6675f75-073b-4ea7-a36b-8bec74afee2d">
              <energy:operationSchedule>
                <energy:DailyPatternSchedule gml:id="GML_5ace32b5-e049-4ad5-b6dc-e13ad760f4e1">
                  <gml:name>KIT-FZK-Haus-Geraete</gml:name>
                  <energy:periodOfYear>
                    <energy:PeriodOfYear>
                      <energy:period>
                        <gml:TimePeriod>
                          <gml:beginPosition>2022-01-01T00:00:00</gml:beginPosition>
                          <gml:endPosition>2022-12-31T00:00:00</gml:endPosition>
                        </gml:TimePeriod>
                      </energy:period>
                      <energy:dailySchedule>
                        <energy:DailySchedule>
                          <energy:dayType>weekDay</energy:dayType>
                          <energy:schedule>
                            <energy:RegularTimeSeries>
                              <energy:variableProperties>
                                <energy:TimeValuesProperties>
                                  <energy:acquisitionMethod>estimation</energy:acquisitionMethod>
                                  <energy:interpolationType>averageInSucceedingInterval</energy:interpolationType>
                                  <energy:thematicDescription>Facility usage</energy:thematicDescription>
                                </energy:TimeValuesProperties>
                              </energy:variableProperties>
                              <energy:temporalExtent>
                                <gml:TimePeriod>
                                  <gml:beginPosition>00:00:00</gml:beginPosition>
                                  <gml:endPosition>00:00:23</gml:endPosition>
                                </gml:TimePeriod>
                              </energy:temporalExtent>
                              <energy:timeInterval unit="hour">1</energy:timeInterval>
                              <energy:values uom="scale">0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 
0.5 0.5 0.5 </energy:values>
                            </energy:RegularTimeSeries>
                          </energy:schedule>
                        </energy:DailySchedule>
                      </energy:dailySchedule>
                      <energy:dailySchedule>
                        <energy:DailySchedule>
                          <energy:dayType>weekEnd</energy:dayType>
                          <energy:schedule>
                            <energy:RegularTimeSeries>
                              <energy:variableProperties>
                                <energy:TimeValuesProperties>
                                  <energy:acquisitionMethod>estimation</energy:acquisitionMethod>
                                  <energy:interpolationType>averageInSucceedingInterval</energy:interpolationType>
                                  <energy:thematicDescription>Facility usage</energy:thematicDescription>
                                </energy:TimeValuesProperties>
                              </energy:variableProperties>
                              <energy:temporalExtent>
                                <gml:TimePeriod>
                                  <gml:beginPosition>00:00:00</gml:beginPosition>
                                  <gml:endPosition>00:00:23</gml:endPosition>
                                </gml:TimePeriod>
                              </energy:temporalExtent>
                              <energy:timeInterval unit="hour">1</energy:timeInterval>
                              <energy:values uom="scale">0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 
0.5 0.5 0.5 </energy:values>
                            </energy:RegularTimeSeries>
                          </energy:schedule>
                        </energy:DailySchedule>
                      </energy:dailySchedule>
                    </energy:PeriodOfYear>
                  </energy:periodOfYear>
                </energy:DailyPatternSchedule>
              </energy:operationSchedule>
              <energy:heatDissipation>
                <energy:HeatExchangeType>
                  <energy:convectiveFraction uom="scale">0.5</energy:convectiveFraction>
                  <energy:radiantFraction uom="scale">0.5</energy:radiantFraction>
                  <energy:totalValue uom="W/m2">5</energy:totalValue>
                </energy:HeatExchangeType>
              </energy:heatDissipation>
            </energy:ElectricalAppliances>
          </energy:equippedWith>
          <energy:equippedWith>
            <energy:LightingFacilities gml:id="GML_ecfa201b-eaf1-4a5e-8243-9dd7d27f37f2">
              <energy:operationSchedule>
                <energy:DailyPatternSchedule gml:id="GML_f24391ea-a776-49f4-a8de-84c4f9bfef2e">
                  <gml:name>KIT-FZK-Haus-Beleuchtung</gml:name>
                  <energy:periodOfYear>
                    <energy:PeriodOfYear>
                      <energy:period>
                        <gml:TimePeriod>
                          <gml:beginPosition>2022-01-01T00:00:00</gml:beginPosition>
                          <gml:endPosition>2022-12-31T00:00:00</gml:endPosition>
                        </gml:TimePeriod>
                      </energy:period>
                      <energy:dailySchedule>
                        <energy:DailySchedule>
                          <energy:dayType>weekDay</energy:dayType>
                          <energy:schedule>
                            <energy:RegularTimeSeries>
                              <energy:variableProperties>
                                <energy:TimeValuesProperties>
                                  <energy:acquisitionMethod>estimation</energy:acquisitionMethod>
                                  <energy:interpolationType>averageInSucceedingInterval</energy:interpolationType>
                                  <energy:thematicDescription>Lighting usage</energy:thematicDescription>
                                </energy:TimeValuesProperties>
                              </energy:variableProperties>
                              <energy:temporalExtent>
                                <gml:TimePeriod>
                                  <gml:beginPosition>00:00:00</gml:beginPosition>
                                  <gml:endPosition>00:00:23</gml:endPosition>
                                </gml:TimePeriod>
                              </energy:temporalExtent>
                              <energy:timeInterval unit="hour">1</energy:timeInterval>
                              <energy:values uom="scale">0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 
0.5 0.5 0.5 </energy:values>
                            </energy:RegularTimeSeries>
                          </energy:schedule>
                        </energy:DailySchedule>
                      </energy:dailySchedule>
                      <energy:dailySchedule>
                        <energy:DailySchedule>
                          <energy:dayType>weekEnd</energy:dayType>
                          <energy:schedule>
                            <energy:RegularTimeSeries>
                              <energy:variableProperties>
                                <energy:TimeValuesProperties>
                                  <energy:acquisitionMethod>estimation</energy:acquisitionMethod>
                                  <energy:interpolationType>averageInSucceedingInterval</energy:interpolationType>
                                  <energy:thematicDescription>Lighting usage</energy:thematicDescription>
                                </energy:TimeValuesProperties>
                              </energy:variableProperties>
                              <energy:temporalExtent>
                                <gml:TimePeriod>
                                  <gml:beginPosition>00:00:00</gml:beginPosition>
                                  <gml:endPosition>00:00:23</gml:endPosition>
                                </gml:TimePeriod>
                              </energy:temporalExtent>
                              <energy:timeInterval unit="hour">1</energy:timeInterval>
                              <energy:values uom="scale">0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 0.5 
0.5 0.5 0.5 </energy:values>
                            </energy:RegularTimeSeries>
                          </energy:schedule>
                        </energy:DailySchedule>
                      </energy:dailySchedule>
                    </energy:PeriodOfYear>
                  </energy:periodOfYear>
                </energy:DailyPatternSchedule>
              </energy:operationSchedule>
              <energy:heatDissipation>
                <energy:HeatExchangeType>
                  <energy:convectiveFraction uom="scale">0.5</energy:convectiveFraction>
                  <energy:radiantFraction uom="scale">0.5</energy:radiantFraction>
                  <energy:totalValue uom="W/m2">4</energy:totalValue>
                </energy:HeatExchangeType>
              </energy:heatDissipation>
            </energy:LightingFacilities>
          </energy:equippedWith>
        </energy:UsageZone>
      </energy:usageZone>
      <energy:floorArea>
        <energy:FloorArea>
          <energy:type>grossFloorArea</energy:type>
          <energy:value uom="m2">240</energy:value>
        </energy:FloorArea>
      </energy:floorArea>
    </bldg:Building>
  </core:cityObjectMember>
  <core:cityObjectMember>
    
    <energy:Construction gml:id="GML_102fe10f-7faf-4c62-97ef-a6d858d9790d">
      <gml:description>KIT-FZK-Haus-Fenster</gml:description>
      <gml:name>KIT-FZK-Haus-Fenster</gml:name>
      <energy:uValue uom="W/K*m2">1.2</energy:uValue>
      <energy:opticalProperties>
        <energy:OpticalProperties>
          <energy:transmittance>
            <energy:Transmittance>
              <energy:fraction uom="scale">0.6</energy:fraction>
              <energy:wavelengthRange>solar</energy:wavelengthRange>
            </energy:Transmittance>
          </energy:transmittance>
          <energy:glazingRatio uom="scale">0.7</energy:glazingRatio>
        </energy:OpticalProperties>
      </energy:opticalProperties>
    </energy:Construction>
  </core:cityObjectMember>
  <gml:featureMember>
    <energy:Construction gml:id="GML_cc49d7fb-4a52-44d7-9154-a3bd931141d7">
      <gml:description>KIT-FZK-Haus-Terrassentuer</gml:description>
      <gml:name>KIT-FZK-Haus-Terrassentuer</gml:name>
      <energy:uValue uom="W/K*m2">2.3</energy:uValue>
      <energy:opticalProperties>
        <energy:OpticalProperties>
          <energy:transmittance>
            <energy:Transmittance>
              <energy:fraction uom="scale">0.6</energy:fraction>
              <energy:wavelengthRange>solar</energy:wavelengthRange>
            </energy:Transmittance>
          </energy:transmittance>
          <energy:glazingRatio uom="scale">0.35</energy:glazingRatio>
        </energy:OpticalProperties>
      </energy:opticalProperties>
    </energy:Construction>
  </gml:featureMember>
  <gml:featureMember>
    <energy:Construction gml:id="GML_d2366771-6937-42fd-b25f-2f0cf586aa86">
      <gml:description>KIT-FZK-Haus-Aussenwand</gml:description>
      <gml:name>KIT-FZK-Haus-Aussenwand</gml:name>
      <energy:uValue uom="W/K*m2">0.4</energy:uValue>
      <energy:layer>
        <energy:Layer gml:id="GML_92a5ca2e-d8a5-40b5-8e4d-7ddf08a8546a">
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_901fadb9-b6dd-4f1f-bc49-c9f153620eec">
              <energy:areaFraction uom="scale">1</energy:areaFraction>
              <energy:thickness uom="m">0.02</energy:thickness>
              <energy:material xlink:href="#GML_5fcd8fd9-4979-472a-bb4e-ec86bab89861" />
            </energy:LayerComponent>
          </energy:layerComponent>
        </energy:Layer>
      </energy:layer>
      <energy:layer>
        <energy:Layer gml:id="GML_1ba20c81-56ce-4da7-af80-3f19266e386a">
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_3aeca128-d9da-4a04-a0a8-a0d8818b42ae">
              <energy:areaFraction uom="scale">1</energy:areaFraction>
              <energy:thickness uom="m">0.2</energy:thickness>
              <energy:material xlink:href="#GML_3ebc13ce-01da-4b12-9326-3cd2c19bf28e" />
            </energy:LayerComponent>
          </energy:layerComponent>
        </energy:Layer>
      </energy:layer>
      <energy:layer>
        <energy:Layer gml:id="GML_2b43dc5b-273f-4f2e-9781-13a53e4368f9">
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_5ff6a346-8fc7-4416-95f2-282197fdff34">
              <energy:areaFraction uom="scale">1</energy:areaFraction>
              <energy:thickness uom="m">0.015</energy:thickness>
              <energy:material xlink:href="#GML_cb591186-74d5-43dd-b205-e1aaa6d3ef65" />
            </energy:LayerComponent>
          </energy:layerComponent>
        </energy:Layer>
      </energy:layer>
    </energy:Construction>
  </gml:featureMember>
  <gml:featureMember>
    <energy:Construction gml:id="GML_e01266a9-b188-453c-abd4-23151e98f470">
      <gml:description>KIT-FZK-Haus-Dach</gml:description>
      <gml:name>KIT-FZK-Haus-Dach</gml:name>
      <energy:uValue uom="W/K*m2">0.4</energy:uValue>
      <energy:layer>
        <energy:Layer gml:id="GML_259e648f-2aae-46b5-8b96-94f91d90e5b3">
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_d6435d44-78b9-46a1-9b20-3e098869aeb1">
              <energy:areaFraction uom="scale">1</energy:areaFraction>
              <energy:thickness uom="m">0.02</energy:thickness>
              <energy:material xlink:href="#GML_e9da0fe1-e94f-4d75-ae9c-a00730e9a808" />
            </energy:LayerComponent>
          </energy:layerComponent>
        </energy:Layer>
      </energy:layer>
      <energy:layer>
        <energy:Layer gml:id="GML_8e8e5c71-37f4-4027-acdb-9a8296d35627">
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_65e850cf-a23c-4cae-8c1e-a65200432cdd">
              <energy:areaFraction uom="scale">1</energy:areaFraction>
              <energy:thickness uom="m">0.04</energy:thickness>
              <energy:material xlink:href="#GML_7396ca1d-062d-4211-a9bb-d6fb3db8d1ae" />
            </energy:LayerComponent>
          </energy:layerComponent>
        </energy:Layer>
      </energy:layer>
      <energy:layer>
        <energy:Layer gml:id="GML_619fc8e9-4cc6-4b93-b221-b1fe709d16e6">
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_94743b63-617f-44d8-8367-c85da4feabee">
              <energy:areaFraction uom="scale">1</energy:areaFraction>
              <energy:thickness uom="m">0.04</energy:thickness>
              <energy:material xlink:href="#GML_9d8a153d-b8f2-429d-ad9d-0266879543a5" />
            </energy:LayerComponent>
          </energy:layerComponent>
        </energy:Layer>
      </energy:layer>
      <energy:layer>
        <energy:Layer gml:id="GML_80d38db3-c88d-4e8f-9d05-6cacdb961418">
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_dbcd2b56-0071-4e9f-a277-3e6d5b7d80a8">
              <energy:areaFraction uom="scale">0.125</energy:areaFraction>
              <energy:thickness uom="m">0.08</energy:thickness>
              <energy:material xlink:href="#GML_7396ca1d-062d-4211-a9bb-d6fb3db8d1ae" />
            </energy:LayerComponent>
          </energy:layerComponent>
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_e3f0b215-0855-4c04-b9b3-30b17df64feb">
              <energy:areaFraction uom="scale">0.875</energy:areaFraction>
              <energy:thickness uom="m">0.08</energy:thickness>
              <energy:material xlink:href="#GML_752ccb0d-e3e2-4380-8907-955ff60a0f20" />
            </energy:LayerComponent>
          </energy:layerComponent>
        </energy:Layer>
      </energy:layer>
      <energy:layer>
        <energy:Layer gml:id="GML_eaf72e17-23b4-4d09-8d52-dea19832ab66">
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_0acce5c8-0857-4448-8e69-d385ed3cd350">
              <energy:areaFraction uom="scale">1</energy:areaFraction>
              <energy:thickness uom="m">0.0005</energy:thickness>
              <energy:material xlink:href="#GML_6be27b4c-c7c8-4d7a-995e-0b0b24143494" />
            </energy:LayerComponent>
          </energy:layerComponent>
        </energy:Layer>
      </energy:layer>
      <energy:layer>
        <energy:Layer gml:id="GML_178c5eef-90b6-4b3c-bd2f-7732cd7c164c">
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_0691ed62-ef03-47fd-9dd1-58947c6fa84a">
              <energy:areaFraction uom="scale">1</energy:areaFraction>
              <energy:thickness uom="m">0.06</energy:thickness>
              <energy:material xlink:href="#GML_752ccb0d-e3e2-4380-8907-955ff60a0f20" />
            </energy:LayerComponent>
          </energy:layerComponent>
        </energy:Layer>
      </energy:layer>
      <energy:layer>
        <energy:Layer gml:id="GML_284f4e5a-2349-4d8b-b567-6302de546c24">
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_a62a6cec-fca9-4e3d-bc3d-8a86cc23a773">
              <energy:areaFraction uom="scale">1</energy:areaFraction>
              <energy:thickness uom="m">0.025</energy:thickness>
              <energy:material xlink:href="#GML_45275837-61b5-4838-a77d-caad28c5c3c1" />
            </energy:LayerComponent>
          </energy:layerComponent>
        </energy:Layer>
      </energy:layer>
    </energy:Construction>
  </gml:featureMember>
  <gml:featureMember>
    <energy:Construction gml:id="GML_f5a37e1c-bf2b-42e0-8c85-6f269d0c51f6">
      <gml:description>KIT-FZK-Haus-Bodenplatte</gml:description>
      <gml:name>KIT-FZK-Haus-Bodenplatte</gml:name>
      <energy:uValue uom="W/K*m2">0.26</energy:uValue>
      <energy:layer>
        <energy:Layer gml:id="GML_c4cb91bc-888f-4517-9067-f4eb6bd3b978">
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_02561bcf-3961-49df-98b5-c24b196c25d7">
              <energy:areaFraction uom="scale">1</energy:areaFraction>
              <energy:thickness uom="m">0.12</energy:thickness>
              <energy:material xlink:href="#GML_0a7e1b86-b652-49b4-bb06-0bc136ecac81" />
            </energy:LayerComponent>
          </energy:layerComponent>
        </energy:Layer>
      </energy:layer>
      <energy:layer>
        <energy:Layer gml:id="GML_cf72d9c4-8223-44d3-9410-f6bc120f340f">
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_e24ff9d6-c6df-4603-848b-931fca0f531f">
              <energy:areaFraction uom="scale">1</energy:areaFraction>
              <energy:thickness uom="m">0.0005</energy:thickness>
              <energy:material xlink:href="#GML_2c373a78-5758-4653-96bc-3a9e96dd003b" />
            </energy:LayerComponent>
          </energy:layerComponent>
        </energy:Layer>
      </energy:layer>
      <energy:layer>
        <energy:Layer gml:id="GML_dc694645-19d1-4466-81a5-12dbdc7554da">
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_060636dc-6545-490e-8829-e92843fe72b2">
              <energy:areaFraction uom="scale">1</energy:areaFraction>
              <energy:thickness uom="m">0.1</energy:thickness>
              <energy:material xlink:href="#GML_a71a295d-209e-4de7-9cca-f5178c3b692a" />
            </energy:LayerComponent>
          </energy:layerComponent>
        </energy:Layer>
      </energy:layer>
      <energy:layer>
        <energy:Layer gml:id="GML_f87c692f-8b8b-4e91-8941-01af15aa4eb6">
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_41f5293e-fb76-47c4-ace1-cfd7a2194b69">
              <energy:areaFraction uom="scale">1</energy:areaFraction>
              <energy:thickness uom="m">0.01</energy:thickness>
              <energy:material xlink:href="#GML_752ccb0d-e3e2-4380-8907-955ff60a0f20" />
            </energy:LayerComponent>
          </energy:layerComponent>
        </energy:Layer>
      </energy:layer>
      <energy:layer>
        <energy:Layer gml:id="GML_4b9e0d84-4e80-48f4-8294-39307c6aa206">
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_a058720b-0ddf-4025-87f8-5104e98c86d3">
              <energy:areaFraction uom="scale">1</energy:areaFraction>
              <energy:thickness uom="m">0.0002</energy:thickness>
              <energy:material xlink:href="#GML_6be27b4c-c7c8-4d7a-995e-0b0b24143494" />
            </energy:LayerComponent>
          </energy:layerComponent>
        </energy:Layer>
      </energy:layer>
      <energy:layer>
        <energy:Layer gml:id="GML_805bc824-9609-4112-888d-b97ab23d95be">
          <energy:layerComponent>
            <energy:LayerComponent gml:id="GML_61b00e15-23f5-4398-9811-177522e27246">
              <energy:areaFraction uom="scale">1</energy:areaFraction>
              <energy:thickness uom="m">0.02</energy:thickness>
              <energy:material xlink:href="#GML_caec1912-7870-4091-bb1e-cba3ff340aa8" />
            </energy:LayerComponent>
          </energy:layerComponent>
        </energy:Layer>
      </energy:layer>
    </energy:Construction>
  </gml:featureMember>
  <gml:featureMember>
    <energy:SolidMaterial gml:id="GML_0a7e1b86-b652-49b4-bb06-0bc136ecac81">
      <gml:description>Polystyrol-Extruderschaum</gml:description>
      <gml:name>KIT-FZK-Haus-Polystyrol-Extruderschaum</gml:name>
      <energy:conductivity uom="W/K*m">0.035</energy:conductivity>
      <energy:density uom="kg/m3">25</energy:density>
      <energy:specificHeat uom="kJ/K*kg">1.5</energy:specificHeat>
    </energy:SolidMaterial>
  </gml:featureMember>
  <gml:featureMember>
    <energy:SolidMaterial gml:id="GML_2c373a78-5758-4653-96bc-3a9e96dd003b">
      <gml:description>Bitumendachbahn</gml:description>
      <gml:name>KIT-FZK-Haus-Bitumendachbahn</gml:name>
      <energy:conductivity uom="W/K*m">0.17</energy:conductivity>
      <energy:density uom="kg/m3">1200</energy:density>
      <energy:specificHeat uom="kJ/K*kg">1.5</energy:specificHeat>
    </energy:SolidMaterial>
  </gml:featureMember>
  <gml:featureMember>
    <energy:SolidMaterial gml:id="GML_3ebc13ce-01da-4b12-9326-3cd2c19bf28e">
      <gml:description>Porenbeton</gml:description>
      <gml:name>KIT-FZK-Haus-Porenbeton</gml:name>
      <energy:conductivity uom="W/K*m">0.13</energy:conductivity>
      <energy:density uom="kg/m3">400</energy:density>
      <energy:specificHeat uom="kJ/K*kg">1</energy:specificHeat>
    </energy:SolidMaterial>
  </gml:featureMember>
  <gml:featureMember>
    <energy:SolidMaterial gml:id="GML_45275837-61b5-4838-a77d-caad28c5c3c1">
      <gml:description>Gipskartonplatte</gml:description>
      <gml:name>KIT-FZK-Haus-Gipskarton</gml:name>
      <energy:conductivity uom="W/K*m">0.25</energy:conductivity>
      <energy:density uom="kg/m3">900</energy:density>
      <energy:specificHeat uom="kJ/K*kg">1</energy:specificHeat>
    </energy:SolidMaterial>
  </gml:featureMember>
  <gml:featureMember>
    <energy:SolidMaterial gml:id="GML_5fcd8fd9-4979-472a-bb4e-ec86bab89861">
      <gml:description>Normalmörtel</gml:description>
      <gml:name>KIT-FZK-Haus-Putz-Aussen</gml:name>
      <energy:conductivity uom="W/K*m">1.2</energy:conductivity>
      <energy:density uom="kg/m3">1800</energy:density>
      <energy:specificHeat uom="kJ/K*kg">1</energy:specificHeat>
    </energy:SolidMaterial>
  </gml:featureMember>
  <gml:featureMember>
    <energy:SolidMaterial gml:id="GML_6be27b4c-c7c8-4d7a-995e-0b0b24143494">
      <gml:description>Polyethylenfolie</gml:description>
      <gml:name>KIT-FZK-Haus-Polyethylenfolie</gml:name>
      <energy:conductivity uom="W/K*m">0.33</energy:conductivity>
      <energy:density uom="kg/m3">960</energy:density>
      <energy:specificHeat uom="kJ/K*kg">1.5</energy:specificHeat>
    </energy:SolidMaterial>
  </gml:featureMember>
  <gml:featureMember>
    <energy:SolidMaterial gml:id="GML_7396ca1d-062d-4211-a9bb-d6fb3db8d1ae">
      <gml:description>Konstruktionsholz Dach</gml:description>
      <gml:name>KIT-FZK-Haus-Holz-Dach</gml:name>
      <energy:conductivity uom="W/K*m">0.13</energy:conductivity>
      <energy:density uom="kg/m3">500</energy:density>
      <energy:specificHeat uom="kJ/K*kg">1.6</energy:specificHeat>
    </energy:SolidMaterial>
  </gml:featureMember>
  <gml:featureMember>
    <energy:SolidMaterial gml:id="GML_752ccb0d-e3e2-4380-8907-955ff60a0f20">
      <gml:description>Polystyrol-Partikelschaum</gml:description>
      <gml:name>KIT-FZK-Haus-Polystyrol-Partikelschaum</gml:name>
      <energy:conductivity uom="W/K*m">0.04</energy:conductivity>
      <energy:density uom="kg/m3">30</energy:density>
      <energy:specificHeat uom="kJ/K*kg">1.5</energy:specificHeat>
    </energy:SolidMaterial>
  </gml:featureMember>
  <gml:featureMember>
    <energy:Gas gml:id="GML_9d8a153d-b8f2-429d-ad9d-0266879543a5">
      <gml:description>Luftschicht</gml:description>
      <gml:name>KIT-FZK-Haus-Luftschicht</gml:name>
      <energy:isVentilated>false</energy:isVentilated>
      <energy:rValue uom="K*m2/W">0.04</energy:rValue>
    </energy:Gas>
  </gml:featureMember>
  <gml:featureMember>
    <energy:SolidMaterial gml:id="GML_a71a295d-209e-4de7-9cca-f5178c3b692a">
      <gml:description>Beton Bodenplatte</gml:description>
      <gml:name>KIT-FZK-Haus-Beton-Bodenplatte</gml:name>
      <energy:conductivity uom="W/K*m">2</energy:conductivity>
      <energy:density uom="kg/m3">2400</energy:density>
      <energy:specificHeat uom="kJ/K*kg">1</energy:specificHeat>
    </energy:SolidMaterial>
  </gml:featureMember>
  <gml:featureMember>
    <energy:SolidMaterial gml:id="GML_caec1912-7870-4091-bb1e-cba3ff340aa8">
      <gml:description>Zement-Estrich</gml:description>
      <gml:name>KIT-FZK-Haus-ZementEstrich</gml:name>
      <energy:conductivity uom="W/K*m">1.4</energy:conductivity>
      <energy:density uom="kg/m3">2000</energy:density>
      <energy:specificHeat uom="kJ/K*kg">1</energy:specificHeat>
    </energy:SolidMaterial>
  </gml:featureMember>
  <gml:featureMember>
    <energy:SolidMaterial gml:id="GML_cb591186-74d5-43dd-b205-e1aaa6d3ef65">
      <gml:description>Putzmörtel (Kalkgips)</gml:description>
      <gml:name>KIT-FZK-Haus-Putz-Innen</gml:name>
      <energy:conductivity uom="W/K*m">0.7</energy:conductivity>
      <energy:density uom="kg/m3">1400</energy:density>
      <energy:specificHeat uom="kJ/K*kg">1</energy:specificHeat>
    </energy:SolidMaterial>
  </gml:featureMember>
  <gml:featureMember>
    <energy:SolidMaterial gml:id="GML_e9da0fe1-e94f-4d75-ae9c-a00730e9a808">
      <gml:description>Dachziegel</gml:description>
      <gml:name>KIT-FZK-Haus-Ziegel</gml:name>
      <energy:conductivity uom="W/K*m">1</energy:conductivity>
      <energy:density uom="kg/m3">2000</energy:density>
      <energy:specificHeat uom="kJ/K*kg">0.8</energy:specificHeat>
    </energy:SolidMaterial>
  </gml:featureMember>
</core:CityModel>