// This program shows how to create and XML DOM using libxml2.
//
// Scenario: the program was originally written by senior 
// programmer Alyssa P. Hacker. It was then maintained by
// the company junior programmer Louis Reasoner which recently
// started using vi. The program was working by now it segfaults. 
//
// Use both gdb and valgrind to find the fix the error. 

/* 
 * section:  Tree
 * synopsis: Creates a tree
 * purpose:  Shows how to create document, nodes and dump it to stdout or file.
 * usage:    tree2 <filename>  -Default output: stdout
 * test:     tree2 > tree2.tmp && diff tree2.tmp $(srcdir)/tree2.res
 * author:   Lucas Brasilino <brasilino@recife.pe.gov.br>
 * copy:     see Copyright for the status of this software
 */

// SOLVED!!
#include <stdio.h>
#include <libxml/parser.h>
#include <libxml/tree.h>

/*
 * gcc -Wall -g -o ex6 ex6.c `xml2-config --cflags --libs`
 * ./ex6
 */

/* A simple example how to create DOM. Libxml2 automagically 
 * allocates the necessary amount of memory to it.
*/
int
main(int argc, char **argv)
{
    xmlDocPtr doc = NULL;       /* document pointer */
    xmlNodePtr root_node = NULL, node = NULL, node1 = NULL;/* node pointers */
    xmlDtdPtr dtd = NULL;       /* DTD pointer */
    char buff[256];
    int i, j;

    LIBXML_TEST_VERSION;

    /* 
     * Creates a new document, a node and set it as a root node
     */
    doc = xmlNewDoc(BAD_CAST "1.0");
    root_node = xmlNewNode(NULL, BAD_CAST "root");
    xmlDocSetRootElement(doc, root_node);

    /*
     * Creates a DTD declaration. Isn't mandatory. 
     */
    dtd = xmlCreateIntSubset(doc, BAD_CAST "root", NULL, BAD_CAST "tree2.dtd");

    /* 
     * xmlNewChild() creates a new node, which is "attached" as child node
     * of root_node node. 
     */
    xmlNewChild(root_node, NULL, BAD_CAST "node1",
                BAD_CAST "content of node 1");
    /* 
     * The same as above, but the new child node doesn't have a content 
     */
    xmlNewChild(root_node, NULL, BAD_CAST "node2", NULL);

    /* 
     * xmlNewProp() creates attributes, which is "attached" to an node.
     * It returns xmlAttrPtr, which isn't used here.
     */
    node =
        xmlNewChild(root_node, NULL, BAD_CAST "node3",
                    BAD_CAST "this node has attributes");
    xmlNewProp(node, BAD_CAST "attribute", BAD_CAST "yes");
    xmlNewProp(node, BAD_CAST "foo", BAD_CAST "bar");

    /*
     * Here goes another way to create nodes. xmlNewNode() and xmlNewText
     * creates a node and a text node separately. They are "attached"
     * by xmlAddChild() 
     */
    node = xmlNewNode(NULL, BAD_CAST "node4");
    node1 = xmlNewText(BAD_CAST
                   "other way to create content (which is also a node)");
    xmlAddChild(node, node1);
    xmlAddChild(root_node, node);


    /* 
     * A simple loop that "automates" nodes creation 
     */
    for (i = 5; i < 7; i++) {
        sprintf(buff, "node%d", i);
        node = xmlNewChild(root_node, NULL, BAD_CAST buff, NULL);
        for (j = 1; j < 4; j++) {
            sprintf(buff, "node%d%d", i, j);
            node1 = xmlNewChild(node, NULL, BAD_CAST buff, NULL);
            xmlNewProp(node1, BAD_CAST "odd", BAD_CAST((j % 2) ? "no" : "yes"));
        }
    }

    /* 
     * Dumping document to stdio or file
     */
    xmlSaveFormatFileEnc(argc > 1 ? argv[1] : "-", doc, "UTF-8", 1);

    // ERROR was in wrong position
    /*free the document */    
    xmlFreeDoc(doc);
    
    /*
     *Free the global variables that may
     *have been allocated by the parser.
     */
    xmlCleanupParser();

    /*
     * this is to debug memory for regression tests
     */
    xmlMemoryDump();
    return(0);
}
