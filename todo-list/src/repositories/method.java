export class TodoListRepository extends DefaultCrudRepository<
  TodoList,
  typeof TodoList.prototype.id,
  TodoListRelations
> {
  // other code

  // Add the following function
  public findByTitle(title: string) {
    return this.findOne({where: {title}});
  }
}