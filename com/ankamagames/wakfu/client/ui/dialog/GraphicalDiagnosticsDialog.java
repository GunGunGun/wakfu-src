package com.ankamagames.wakfu.client.ui.dialog;

import java.util.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.layout.*;
import com.ankamagames.xulor2.*;
import java.awt.*;
import com.ankamagames.xulor2.event.listener.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.renderer.*;
import com.ankamagames.xulor2.property.*;
import com.ankamagames.xulor2.core.renderer.condition.*;
import com.ankamagames.xulor2.appearance.*;

public class GraphicalDiagnosticsDialog implements BasicElementFactory
{
    private Stack<ElementMap> elementMaps;
    private Environment env;
    
    public GraphicalDiagnosticsDialog() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public BasicElement getElement(final Environment env, final ElementMap item) {
        this.env = env;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final String id = "mainContainer";
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, checkOut);
        }
        checkOut.setStyle("popup");
        checkOut.setPrefSize(new Dimension(500, 0));
        checkOut.onAttributesInitialized();
        final StaticLayoutData element = new StaticLayoutData();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setSize(new Dimension(-2, -2));
        element.setAlign(Alignment17.CENTER);
        checkOut.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        final RowLayout checkOut2 = RowLayout.checkOut();
        checkOut2.setHorizontal(false);
        checkOut2.setAlign(Alignment9.NORTH);
        checkOut.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final Container checkOut3 = Container.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setExpandable(false);
        checkOut3.setPrefSize(new Dimension(0, 0));
        checkOut.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        final RowLayout checkOut4 = RowLayout.checkOut();
        checkOut4.setHorizontal(false);
        checkOut3.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        final Container checkOut5 = Container.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut3.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        final RowLayout checkOut6 = RowLayout.checkOut();
        checkOut5.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final Image element2 = new Image();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setExpandable(false);
        element2.setScaled(false);
        element2.setDisplaySize(new Dimension(54, 50));
        checkOut5.addBasicElement(element2);
        element2.onAttributesInitialized();
        final RowLayoutData element3 = new RowLayoutData();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setAlign(Alignment9.NORTH);
        element2.addBasicElement(element3);
        element3.onAttributesInitialized();
        element3.onChildrenAdded();
        final PixmapElement checkOut7 = PixmapElement.checkOut();
        checkOut7.setElementMap(elementMap);
        element2.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        final PropertyElement checkOut8 = PropertyElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setName("graphicalDiagnostic");
        checkOut8.setAttribute("texture");
        checkOut8.setField("summaryIconURL");
        checkOut7.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        checkOut7.onChildrenAdded();
        element2.onChildrenAdded();
        final TextView element4 = new TextView();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setStyle("white");
        element4.setMinWidth(350);
        checkOut5.addBasicElement(element4);
        element4.onAttributesInitialized();
        final PropertyElement checkOut9 = PropertyElement.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setName("graphicalDiagnostic");
        checkOut9.setAttribute("text");
        checkOut9.setField("summaryDescription");
        element4.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        element4.onChildrenAdded();
        checkOut5.onChildrenAdded();
        final Container checkOut10 = Container.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut3.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        final StaticLayout element5 = new StaticLayout();
        element5.onCheckOut();
        element5.setAdaptToContentSize(true);
        checkOut10.addBasicElement(element5);
        element5.onAttributesInitialized();
        element5.onChildrenAdded();
        final Button element6 = new Button();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        element6.setText("%ok%".replace("%ok%", Xulor.getInstance().getTranslatedString("ok")));
        final MouseClickedListener onClick = new MouseClickedListener();
        onClick.setCallBackFunc("unloadDialog");
        element6.setOnClick(onClick);
        checkOut10.addBasicElement(element6);
        element6.onAttributesInitialized();
        final DecoratorAppearance appearance = element6.getAppearance();
        appearance.setElementMap(elementMap);
        element6.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Padding element7 = new Padding();
        element7.onCheckOut();
        element7.setElementMap(elementMap);
        element7.setInsets(new Insets(0, 20, 0, 20));
        appearance.addBasicElement(element7);
        element7.onAttributesInitialized();
        element7.onChildrenAdded();
        appearance.onChildrenAdded();
        final StaticLayoutData element8 = new StaticLayoutData();
        element8.onCheckOut();
        element8.setElementMap(elementMap);
        element8.setAlign(Alignment17.CENTER);
        element6.addBasicElement(element8);
        element8.onAttributesInitialized();
        element8.onChildrenAdded();
        element6.onChildrenAdded();
        final Container checkOut11 = Container.checkOut();
        checkOut11.setElementMap(elementMap);
        checkOut10.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        final StaticLayoutData element9 = new StaticLayoutData();
        element9.onCheckOut();
        element9.setElementMap(elementMap);
        element9.setAlign(Alignment17.EAST);
        checkOut11.addBasicElement(element9);
        element9.onAttributesInitialized();
        element9.onChildrenAdded();
        final Label element10 = new Label();
        element10.onCheckOut();
        element10.setElementMap(elementMap);
        element10.setStyle("popupInformation");
        element10.setText("%details%".replace("%details%", Xulor.getInstance().getTranslatedString("details")));
        checkOut11.addBasicElement(element10);
        element10.onAttributesInitialized();
        element10.onChildrenAdded();
        final ToggleButton element11 = new ToggleButton();
        element11.onCheckOut();
        element11.setElementMap(elementMap);
        final SelectionChangedListener onSelectionChange = new SelectionChangedListener();
        onSelectionChange.setCallBackFunc("wakfu.graphicalDiagnotics:toggleDetails(details)");
        element11.setOnSelectionChange(onSelectionChange);
        checkOut11.addBasicElement(element11);
        element11.onAttributesInitialized();
        final DecoratorAppearance appearance2 = element11.getAppearance();
        appearance2.setElementMap(elementMap);
        element11.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final Margin checkOut12 = Margin.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setInsets(new Insets(0, 5, 0, 0));
        appearance2.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        checkOut12.onChildrenAdded();
        appearance2.onChildrenAdded();
        element11.onChildrenAdded();
        checkOut11.onChildrenAdded();
        checkOut10.onChildrenAdded();
        checkOut3.onChildrenAdded();
        final String id2 = "details";
        final Container checkOut13 = Container.checkOut();
        checkOut13.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, checkOut13);
        }
        checkOut13.setVisible(false);
        checkOut.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        final DecoratorAppearance appearance3 = checkOut13.getAppearance();
        appearance3.setElementMap(elementMap);
        checkOut13.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        appearance3.onChildrenAdded();
        final RowLayout checkOut14 = RowLayout.checkOut();
        checkOut14.setHorizontal(false);
        checkOut14.setAlign(Alignment9.NORTH);
        checkOut13.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        checkOut14.onChildrenAdded();
        final Container checkOut15 = Container.checkOut();
        checkOut15.setElementMap(elementMap);
        checkOut15.setExpandable(false);
        checkOut15.setStyle("lineSeparator");
        checkOut15.setPrefSize(new Dimension(0, 7));
        checkOut13.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        final DecoratorAppearance appearance4 = checkOut15.getAppearance();
        appearance4.setElementMap(elementMap);
        checkOut15.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final Margin checkOut16 = Margin.checkOut();
        checkOut16.setElementMap(elementMap);
        checkOut16.setInsets(new Insets(5, 0, 2, 0));
        appearance4.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        checkOut16.onChildrenAdded();
        appearance4.onChildrenAdded();
        checkOut15.onChildrenAdded();
        final Label element12 = new Label();
        element12.onCheckOut();
        element12.setElementMap(elementMap);
        element12.setExpandable(false);
        element12.setStyle("whiteTitle");
        element12.setText("%details%".replace("%details%", Xulor.getInstance().getTranslatedString("details")));
        checkOut13.addBasicElement(element12);
        element12.onAttributesInitialized();
        element12.onChildrenAdded();
        final List element13 = new List();
        element13.onCheckOut();
        element13.setElementMap(elementMap);
        element13.setExpandable(false);
        element13.setHorizontal(false);
        element13.setCellSize(new Dimension(100.0f, 32));
        element13.setAutoIdealSize(true);
        element13.setIdealSizeMinColumns(1);
        element13.setIdealSizeMaxColumns(1);
        checkOut13.addBasicElement(element13);
        element13.onAttributesInitialized();
        final PropertyElement checkOut17 = PropertyElement.checkOut();
        checkOut17.setElementMap(elementMap);
        checkOut17.setName("graphicalDiagnostic");
        checkOut17.setAttribute("content");
        checkOut17.setField("testList");
        element13.addBasicElement(checkOut17);
        checkOut17.onAttributesInitialized();
        checkOut17.onChildrenAdded();
        final ItemRenderer element14 = new ItemRenderer();
        element14.onCheckOut();
        element14.setElementMap(elementMap);
        element13.addBasicElement(element14);
        element14.onAttributesInitialized();
        final ConditionResult element15 = new ConditionResult();
        element15.onCheckOut();
        element15.setElementMap(elementMap);
        element14.addBasicElement(element15);
        element15.onAttributesInitialized();
        final NotNullCondition element16 = new NotNullCondition();
        element16.onCheckOut();
        element16.setElementMap(elementMap);
        element15.addBasicElement(element16);
        element16.onAttributesInitialized();
        element16.onChildrenAdded();
        element15.onChildrenAdded();
        final Container checkOut18 = Container.checkOut();
        checkOut18.setElementMap(elementMap);
        element14.addBasicElement(checkOut18);
        checkOut18.onAttributesInitialized();
        final RowLayout checkOut19 = RowLayout.checkOut();
        checkOut19.setHgap((short)5);
        checkOut18.addBasicElement(checkOut19);
        checkOut19.onAttributesInitialized();
        checkOut19.onChildrenAdded();
        final Image element17 = new Image();
        element17.onCheckOut();
        element17.setElementMap(elementMap);
        element17.setExpandable(false);
        element17.setScaled(false);
        checkOut18.addBasicElement(element17);
        element17.onAttributesInitialized();
        final RowLayoutData element18 = new RowLayoutData();
        element18.onCheckOut();
        element18.setElementMap(elementMap);
        element18.setAlign(Alignment9.CENTER);
        element17.addBasicElement(element18);
        element18.onAttributesInitialized();
        element18.onChildrenAdded();
        final ItemElement element19 = new ItemElement();
        element19.onCheckOut();
        element19.setElementMap(elementMap);
        element19.setAttribute("style");
        element19.setField("success");
        element17.addBasicElement(element19);
        element19.onAttributesInitialized();
        final ConditionResult element20 = new ConditionResult();
        element20.onCheckOut();
        element20.setElementMap(elementMap);
        element20.setValue("smallValid");
        element20.setElseValue("smallCancel");
        element19.addBasicElement(element20);
        element20.onAttributesInitialized();
        final TrueCondition element21 = new TrueCondition();
        element21.onCheckOut();
        element21.setElementMap(elementMap);
        element20.addBasicElement(element21);
        element21.onAttributesInitialized();
        element21.onChildrenAdded();
        element20.onChildrenAdded();
        element19.onChildrenAdded();
        element17.onChildrenAdded();
        final Label element22 = new Label();
        element22.onCheckOut();
        element22.setElementMap(elementMap);
        element22.setStyle("popupInformation");
        checkOut18.addBasicElement(element22);
        element22.onAttributesInitialized();
        final DecoratorAppearance appearance5 = element22.getAppearance();
        appearance5.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance5).setAlign(Alignment9.WEST);
        element22.addBasicElement(appearance5);
        appearance5.onAttributesInitialized();
        appearance5.onChildrenAdded();
        final ItemElement element23 = new ItemElement();
        element23.onCheckOut();
        element23.setElementMap(elementMap);
        element23.setAttribute("text");
        element23.setField("description");
        element22.addBasicElement(element23);
        element23.onAttributesInitialized();
        element23.onChildrenAdded();
        element22.onChildrenAdded();
        checkOut18.onChildrenAdded();
        element14.onChildrenAdded();
        element13.onChildrenAdded();
        checkOut13.onChildrenAdded();
        checkOut.onChildrenAdded();
        return checkOut;
    }
}