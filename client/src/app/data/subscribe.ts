export class Subscribe {
  id: string;
  shopItemId: string;
  userInfoId: string;
  count: string;
  date: string;
}

export class SubscribeWithName {
  subscribe: Subscribe;
  shopItemName: string;
}
