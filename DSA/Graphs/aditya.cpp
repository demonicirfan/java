//node.h
typedef struct Node
{
    int value;
    struct Node *nextNode;
} Node;

//linkedlist.h
typedef struct LinkedList
{
    Node *head;
    int count;
} LinkedList;

//liblinkedlist.c
int deleteSecondLargest(LinkedList *list)
{
    if (list->count == 0)
        return 1;
    if (list->count == 1)
        return 2;
    Node *temp = list->head;
    Node *largest = temp;
    Node *prev = NULL;
    Node *prev1 = NULL;
    Node *ptr = temp;

    //finding the second largest node
    while (temp != NULL)
    {
        if (temp->value > largest->value)
        {
            largest = temp;
        }
        else if ((temp->value != largest->value) && (temp->value > ptr->value))
        { //here's the code failing
            prev1 = prev;
            ptr = temp;
        }
        prev = temp;
        temp = temp->nextNode;
    }

    //deleting it
    if (ptr == list->head)
        list->head = list->head->nextNode;
    else
        prev1->nextNode = ptr->nextNode;
    free(ptr);
    list->count--;
    return 0;
}